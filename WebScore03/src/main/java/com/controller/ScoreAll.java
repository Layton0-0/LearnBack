package com.controller;

import java.io.IOException;
import java.util.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.biz.*;
import com.entity.*;

/**
 * Servlet implementation class ScoreAll
 */
@WebServlet("/ScoreAll")
public class ScoreAll extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// db에 있는 전체 내용을 리턴받아 jsp로 보낸다.
		// view -> controller -> model
		// index.html -> ScoreAll.java <-> ScoreBiz <-> ScoreDao
		// ScoreAll.jsp
		
		List<Score> all = new ScoreBiz().getScoreAll();
		
		// 값을 받아서 ScoreAll.jsp로 전송
		request.setAttribute("all", all); //저장
		
		// 전송
		RequestDispatcher rd = request.getRequestDispatcher("ScoreAll.jsp");
		rd.forward(request, response);
	}


}
