package kurs24;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "Login", urlPatterns = "/Login")
public class Login extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int login;
		int password;

		try {
			login = Integer.parseInt(request.getParameter("login"));
			password = Integer.parseInt(request.getParameter("password"));
		} catch (NumberFormatException e) {
			login = 310302;
			password = 310302;
		}

		if (login == 123 || password == 123) {
			RequestDispatcher dispatcher = request.getRequestDispatcher("/index.jsp");
			dispatcher.forward(request, response);
			login = 0;
			password = 0;
		} else {
			RequestDispatcher dispatcher = request.getRequestDispatcher("/Login.jsp");
			dispatcher.forward(request, response);
			login = 0;
			password = 0;
		}
	}

}
