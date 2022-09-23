package com.snort.intelli.mvc.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * @author Siddhartha Sharma
 * @apiNote : DispatcherServlet will be initialized just after tomcat started.
 *
 */
public class WebAppDispatcherInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		Class[] servletConfigClasses = { ApplicationConfig.class };
		return servletConfigClasses;
	}

	@Override
	protected String[] getServletMappings() {
		String[] mapping = { "/" };
		return mapping;
	}

}
