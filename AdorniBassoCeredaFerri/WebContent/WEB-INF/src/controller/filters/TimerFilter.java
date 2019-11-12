package controller.filters;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

/**
 * Servlet Filter implementation class TimerFilter
 * 
 * This filter is a log filter, it automatically logs the duration of any interaction -  check the console!
 */
@WebFilter("/*")
public class TimerFilter implements Filter {

	private FilterConfig config;
	
    /**
     * Default constructor. 
     */
    public TimerFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		//pre-processing
		long before = System.currentTimeMillis();
		
		//forward
		chain.doFilter(request, response);;
		
		//post-processing
		long after = System.currentTimeMillis();
		
		String requestName = "";
		if (request instanceof HttpServletRequest) {
			requestName = ((HttpServletRequest)request).getRequestURI();
		}
				
		config.getServletContext().log(requestName + ": "+ (after-before) + "ms");
		//System.out.println(requestName + ": "+ (after-before) + "ms");
	}

		
		
		
	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		this.config = fConfig;
	}

}
