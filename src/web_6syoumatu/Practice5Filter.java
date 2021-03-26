package web_6syoumatu;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@WebFilter("/Practice5Servlet")
public class Practice5Filter implements Filter{

	public void init(FilterConfig fConfig) throws ServletException{


	}


	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException{
		Integer count = 0;
		HttpSession session = ((HttpServletRequest)request).getSession();
		count++;
		session.setAttribute("count", count);
		session.setAttribute("test", (int)10);
		chain.doFilter(request, response);

	}

	public void destroy() {

	}

}
