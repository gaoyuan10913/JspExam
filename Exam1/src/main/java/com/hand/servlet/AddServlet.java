package com.hand.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hand.dao.FilmDao;
import com.hand.dao.impl.FilmDaoImpl;


public class AddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
    public AddServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		FilmDao film = new FilmDaoImpl();
		String title = request.getParameter("title");
		String description = request.getParameter("description");
		int language_id = Integer.parseInt(request.getParameter("language"));
		if(title == null || description == null){
			RequestDispatcher rd = request.getRequestDispatcher("/add.jsp");
			rd.forward(request, response);
		}else{
			String sql = "insert into film(title,description,language_id) values('"+title+"','"+description+"','"+language_id+"')";
			boolean bool = film.addFilm(sql);
			if(bool){
				RequestDispatcher rd = request.getRequestDispatcher("/ShowServlet");
				rd.forward(request, response);
			}
		}

	}

}
