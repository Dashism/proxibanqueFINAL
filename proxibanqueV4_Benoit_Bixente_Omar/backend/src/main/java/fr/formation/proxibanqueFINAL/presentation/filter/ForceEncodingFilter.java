package fr.formation.proxibanqueFINAL.presentation.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * Classe permettant de forcer la configuration de la police en UTF-8.
 * @author Adminl
 *
 */
public class ForceEncodingFilter implements Filter {
	
	private static final String CHARSET = "UTF-8";

	/**
	 * Initialiser le configuration du Filter
	 */
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
	}

	/**
	 * Forcer la police en UTF-8
	 */
	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		request.setCharacterEncoding(ForceEncodingFilter.CHARSET);
		chain.doFilter(request, response);
	}

	@Override
	public void destroy() {
	}

}
