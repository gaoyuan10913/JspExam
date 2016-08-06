package com.hand.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hand.entity.Customer;
import com.hand.service.CheckCustomerService;

public class CheckServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private CheckCustomerService chu = new CheckCustomerService();
	public CheckServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		String name = request.getParameter("name");
		System.out.println(name);
		RequestDispatcher rd = null;
		String forward = null;
		if(name == null){
			request.setAttribute("msg", "用户名为空");
			rd = request.getRequestDispatcher("error.jsp");
			rd.forward(request, response);
		}else{
			Customer cust = new Customer();
			cust.setFirstName(name);
			boolean bool = chu.check(cust);
			if(bool){
				forward = "success.jsp";
			}else{
				request.setAttribute("msg",	"用户名输入错误");
				forward = "error.jsp";
			}
			rd = request.getRequestDispatcher(forward);
			rd.forward(request, response);
		}
				
	}

}
