package com.hand.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hand.dao.LanguageDao;
import com.hand.dao.impl.LanguageDaoImpl;
import com.hand.entity.Language;

public class LanguageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LanguageServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		LanguageDao language = new LanguageDaoImpl();
		String sql = "select language_id,name from language";
		ArrayList<Language> list = language.checkLanguage(sql);
		request.setAttribute("list", list);
		RequestDispatcher rd = request.getRequestDispatcher("/add.jsp");
		rd.forward(request, response);
	}

}
