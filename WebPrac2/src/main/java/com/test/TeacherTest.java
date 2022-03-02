package com.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TeacherTest
 */
@WebServlet(
		description = "practicing", 
		urlPatterns = { 
				"/myinsert", 
				"/mydelete", 
				"/myupdate",
				"/myselect",
				"/myview"
		})
public class TeacherTest extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("do_post");
	}

	private void doRes(HttpServletRequest req, HttpServletResponse resp) {
		// TODO Auto-generated method stub
		
		
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		if(req.getContextPath().endsWith("myview")) {
			doRes(req,resp);
		}
		
//		System.out.println("do_get");
//		System.out.println("요청한 contextPath: " + req.getContextPath());
//		System.out.println("리모트 호스트: " + req.getRemoteHost());
//		System.out.println("remoteAddr: "+req.getRemoteAddr());
//		System.out.println("remotePort: "+ req.getRemotePort());
//		System.out.println("로컬 호스트: " + req.getLocalAddr());
//		System.out.println("localName: "+req.getLocalName());
//		System.out.println("localPort: "+req.getLocalPort());
//		System.out.println();
//		
//		System.out.println("pathinfo: "+req.getPathInfo());
//		System.out.println("contentType: "+req.getContentType());
//		System.out.println("queryString: "+req.getQueryString());
//		System.out.println("requestURI: "+req.getRequestURI());
		
		// 응답 페이지 만들기
		// 1. 컨텐트 타입 지정
//		resp.setContentType("text/html;charset=UTF-8");
		resp.setContentType("text/html");
		
		// 2. 출력 객체
		PrintWriter out = resp.getWriter();
		
		// 3. 출력 구문
		out.print("<html><body>");
		out.print("<h3>teacher test: " + req.getRequestURI() +"</h3>");
		out.print("</body></html>");
		
		// 4. 종료
		out.close();
	}

	
	
	

	

}
