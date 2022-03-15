package com.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.biz.*;
import com.entity.*;

/**
 * Servlet implementation class MyController
 */
@WebServlet({ "/MyController", "/ScoreAll", "/ScoreDelete", "/ScoreUpdate", "/ScoreFind", "/ScoreInput" })
public class MyController extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String url = request.getRequestURI();

		if (url.endsWith("ScoreAll")) {
			doScoreAll(request, response);
		} else if (url.endsWith("ScoreUpdate")) {
			doScoreUpdate(request, response);
		} else if (url.endsWith("ScoreDelete")) {
			doScoreDelete(request, response);
		} else if (url.endsWith("ScoreFind")) {
			doScoreFind(request, response);
		} else if (url.endsWith("ScoreInput")) {
			doScoreInput(request, response);
		}

	}


	protected void doScoreAll(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// db에 있는 전체 내용을 리턴받아 jsp로 보낸다.
		// view -> controller -> model
		// index.html -> ScoreAll.java <-> ScoreBiz <-> ScoreDao
		// ScoreAll.jsp
		List<Score> all = new ScoreBiz().getScoreAll();
		// 값을 받아서 ScoreAll.jsp로 전송
		request.setAttribute("all", all); // 저장
		// 전송
//			ScoreAll.jsp랑 출력 연결을 하고, forward로 그쪽으로 정보를 보내 출력(include일 경우 자기 스스로 처리)
		RequestDispatcher rd = request.getRequestDispatcher("ScoreAll.jsp");
		rd.forward(request, response);
	}

	protected void doScoreDelete(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int r = new ScoreBiz().getScoreDelete(request.getParameter("name"));
		if (r > 0) {
			response.sendRedirect("ScoreAll");
		}
	}

	protected void doScoreFind(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 수정할 이름을 받아와서 비즈로 보낸다.
		String name = request.getParameter("name");
		Score myScore = new ScoreBiz().getScoreFind(name);
		// 담아서 출력할 ScoreUpdate.jsp로 리턴.

		request.setAttribute("find", myScore);
		RequestDispatcher rd = request.getRequestDispatcher("ScoreUpdate.jsp");
		rd.forward(request, response);
	}

	protected void doScoreInput(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Score myScore = new Score();
		String name = request.getParameter("name");
		int kor = Integer.parseInt(request.getParameter("kor"));
		int eng = Integer.parseInt(request.getParameter("eng"));
		int mat = Integer.parseInt(request.getParameter("mat"));
		myScore.setName(name);
		myScore.setKor(kor);
		myScore.setEng(eng);
		myScore.setMat(mat);

		// biz 호출한 다음
		ScoreBiz biz = new ScoreBiz();
		int r = biz.getScoreInsert(myScore);
		if (r > 0) {
			response.sendRedirect("ScoreAll");
		}
	}

	protected void doScoreUpdate(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String name = request.getParameter("name");
		int kor = Integer.parseInt(request.getParameter("kor"));
		int eng = Integer.parseInt(request.getParameter("eng"));
		int mat = Integer.parseInt(request.getParameter("mat"));

		Score myScore = new Score(name, kor, eng, mat);

		// biz 호출한 다음
		ScoreBiz biz = new ScoreBiz();
		int r = biz.getScoreUpdate(myScore);
		if (r > 0) {
			response.sendRedirect("ScoreAll");
		}
	}

}
