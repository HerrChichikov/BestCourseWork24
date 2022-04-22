package kurs24;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Login", urlPatterns = "/Login")
public class Login extends HttpServlet {
	 String last;

	/*protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.getWriter().append("Served at: ").append(request.getContextPath());
	}*/

	public class User {
		private String password;
		private String login;

		public void setLogin(String login) {
			this.login = login;
		}

		public String getLogin() {
			return this.login;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public String getPassword() {
			return this.password;
		}

	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		User user = new User();
		user.setLogin(request.getParameter("login"));
		user.setPassword(request.getParameter("password"));
		user.getLogin();
		user.getPassword();
		
		String login = user.getLogin();
		String password = user.getPassword();
		request.setCharacterEncoding("UTF-8");
		if (login.equals("123") && password.equals("123")) {
			request.getRequestDispatcher("/index.jsp").forward(request, response);
			login = "0";
			password = "0";
		} else {
			RequestDispatcher dispatcher = request.getRequestDispatcher("/Login.jsp");
			dispatcher.forward(request, response);
			login = "0";
			password = "0";
		}
	}}
		
		

//		try {
//			login = Integer.parseInt(request.getParameter("login"));
//			password = Integer.parseInt(request.getParameter("password"));
//		} catch (NumberFormatException e) {
//			login = 310302;
//			password = 310302;
//		}
//
		
	



