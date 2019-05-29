package com.pro.test;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pro.UserDAO;
@WebServlet("/mo")
public class StartEx extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		UserDAO dao = new UserDAO();
		req.setAttribute("list",dao.list());
//	req.setAttribute("list", "string");
		req.getRequestDispatcher("notice.jsp").forward(req, resp);
	}
}
