package com.test;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyRes
 */
@WebServlet("/myres")
public class MyRes extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String id = request.getParameter("myid"); // name을 호출하면 value를 리턴한다.
		String pw = request.getParameter("mypw");
		response.getWriter().append("<h1>id: " + id).append("<br>pw: " + pw + "</h1>").append(request.getQueryString())
				.append(request.getMethod());
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// post로 하면 queryString이 없음. null -> 보안이 좋음.
		
		doGet(req, resp);
		
	}

}
