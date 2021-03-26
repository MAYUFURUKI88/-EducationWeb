package com.rapideact.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter("/FilterServlet")
public class FilterTest implements Filter {

	public FilterTest() {

	}

	public void destroy() {

	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		//前処理
		System.out.println("フィルタ実行（前処理）");

		//サーブレットクラスの処理
		chain.doFilter(request, response);

		//後処理
		System.out.println("フィルタ実行（後処理）");
	}

	public void init(FilterConfig fConfig) throws ServletException {
	}

}
