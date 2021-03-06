package zizixin.JavaPractice.servlet.filter;

import java.io.IOException;

import javax.servlet.DispatcherType;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

@WebFilter(filterName = "filter1", urlPatterns="/*",dispatcherTypes = {DispatcherType.REQUEST, DispatcherType.FORWARD})
public class FilterTestInstanceOne implements Filter{

	@Override
	public void destroy() {
		System.out.println(this.toString()+"filter is desctory");
	}

	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain arg2)
			throws IOException, ServletException {
		System.out.println(((HttpServletRequest)arg0).getSession().toString());
		arg2.doFilter(arg0, arg1);
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		System.out.println("FilterConfig is"+arg0.toString());
		System.out.println(this.getClass().getName()+"is init instance");
	}

}
