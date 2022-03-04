package com.test;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyScore
 */
@WebServlet({ "/s_insert", "/s_delete", "/s_update", "/s_select" })
public class MyScore extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */

	// s_insert를 -> doGet() -> doMyInsert()
	protected void doMyInsert(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		response.getWriter().append("s_insert page");
	}
	
	protected void doMyDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		response.getWriter().append("s_delete page");
	}
	
	protected void doMyUpdate(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		response.getWriter().append("s_update page");
	}
	
	protected void doMySelect(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		response.getWriter().append("s_select page");
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		if(request.getRequestURI().endsWith("s_insert")) { // doMyInsert()
			doMyInsert(request, response);
		}
		
		if(request.getRequestURI().endsWith("s_delete")) { // doMyDelete()
			doMyDelete(request, response);
		}
		
		if(request.getRequestURI().endsWith("s_update")) { // doMyUpdate()
			doMyUpdate(request, response);
		}
		
		if(request.getRequestURI().endsWith("s_select")) { // doMySelect()
			doMySelect(request, response);
		}
		
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
