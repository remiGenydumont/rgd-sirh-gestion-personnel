package dev.sgp.filtre;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import dev.sgp.entite.VisiteWeb;

public class FrequentationFilter implements Filter {
	private FilterConfig config = null;

	@Override
	public void init(FilterConfig config) throws ServletException {
		this.config = config;
		config.getServletContext().log("Frequentation Filter initialized");
	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain)
			throws IOException, ServletException {
		String path = ((HttpServletRequest) req).getRequestURI();
		long before = System.currentTimeMillis();
		chain.doFilter(req, resp);
		long after = System.currentTimeMillis();
		
		Map<String, VisiteWeb> visitLog = (Map<String, VisiteWeb>) config.getServletContext().getAttribute("visitLog");
		if(visitLog == null){
			visitLog = new HashMap();
		}
		visitLog.put(path, new VisiteWeb(path, (int) (before-after)));
		
		config.getServletContext().setAttribute("visitLog", visitLog);
		
		
		
		config.getServletContext().log(path + " : " + (after - before));
	}

	@Override
	public void destroy() { 
	}


}
