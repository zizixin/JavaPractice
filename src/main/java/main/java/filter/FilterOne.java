package filter;


import java.io.IOException;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;


/**
 * @author zizixin
 *
 */
@WebFilter(filterName = "filter1", urlPatterns="/*",dispatcherTypes = {DispatcherType.REQUEST, DispatcherType.FORWARD})
public class FilterOne implements Filter{

//	public FilterOne(){
//		System.out.println(this.getClass().getName()+"constructor is invoke");
//	}
	
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		System.out.println("fileter init");
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		chain.doFilter(request, response);
	}

	@Override
	public void destroy() {
		System.out.println("filter destory");
	}
}
