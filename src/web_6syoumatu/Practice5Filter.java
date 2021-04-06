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
public class Practice5Filter implements Filter {

	public void init(FilterConfig fConfig) throws ServletException {

	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		// セッションから値を取り出す
		HttpSession session = ((HttpServletRequest) request).getSession();
		Object ct = session.getAttribute("count");
		// 取り出した値をカウントアップする
		if (ct == null) {
			session.setAttribute("count", 1);
		} else {
			Integer fuurki = (int) ct;
			fuurki++;
			session.setAttribute("count", fuurki);
		}


		// 同じ名前でセッションに保存する

		session.setAttribute("test", (int) 10);
		chain.doFilter(request, response);

	}

	public void destroy() {

	}

}
