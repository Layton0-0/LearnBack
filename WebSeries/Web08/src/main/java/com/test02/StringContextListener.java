package com.test02;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class StringContextListener implements ServletContextListener {

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		System.out.println("StringContextListener ���� �Ǿ����ϴ�");
	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		ServletContext ctx = arg0.getServletContext();
		Address ar = new Address("Dominico", "seoul", "77-7777");
		ctx.setAttribute("address", ar);
		System.out.println("StringContextListener �ʱ�ȭ �Ǿ����ϴ�");
	}

}
