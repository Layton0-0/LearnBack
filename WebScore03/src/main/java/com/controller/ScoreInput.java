package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.biz.ScoreBiz;
import com.entity.Score;

/**
 * Servlet implementation class ScoreInput
 */
@WebServlet("/ScoreInput")
public class ScoreInput extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
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
		if(r > 0) {
			response.sendRedirect("ScoreAll");
		}
	}


}
