package com.omnipotent.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 自定义过滤器
 * 
 * @author zhangtb
 * @date 2016-7-10 19:51:01
 * @since 1.0.0
 */
public class PermissionFilter implements Filter {

	//@SuppressWarnings("unused")
	//private String filterURL;
	
	public void init(FilterConfig filterConfig) throws ServletException {
		//filterURL = filterConfig.getInitParameter("filterURL");
		System.out.println("PermissionFilter init...");
	}
	
	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest request = (HttpServletRequest) req;
		HttpServletResponse response = (HttpServletResponse) resp;
		String requestURI = request.getRequestURI();
		System.out.println("Request URI: " + requestURI);
		chain.doFilter(request, response);
	}
	
	public void destroy() {
		System.out.println("PermissionFilter destroy...");
	}
	
}
