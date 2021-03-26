package com.rapideact.listener;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class ListenerTest implements ServletRequestListener {

	public ListenerTest() {

	}

	@Override
	public void requestDestroyed(ServletRequestEvent arg0) {
		System.out.println("レスポンス完了");
	}

	@Override
	public void requestInitialized(ServletRequestEvent arg0) {
		System.out.println("リクエスト発生");
	}

}
