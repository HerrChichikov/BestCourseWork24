package kurs24;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
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

	/*
	 * protected void doGet(HttpServletRequest request, HttpServletResponse
	 * response) throws ServletException, IOException {
	 * 
	 * response.getWriter().append("Served at: ").append(request.getContextPath());
	 * }
	 */

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
		String filepath = new File("").getCanonicalPath();
		String[] parsfilepath = filepath.split("/");
		int lengthpath = parsfilepath.length;
		String abspath = "";
		for (int i = 0; i < (lengthpath - 1); i++) {
			abspath = abspath + parsfilepath[i] + "/";
		}
		filepath = abspath + "webapps/Calculate/logs.txt";
		File file = new File(filepath);
		FileInputStream fis = new FileInputStream(file);
		InputStreamReader isr = new InputStreamReader(fis, "utf-8");
		BufferedReader br = new BufferedReader(isr);
		String line = "";
		String login = user.getLogin();
		String password = user.getPassword();
		int b;
		b = 0;
		request.setCharacterEncoding("UTF-8");
		if((login.equals("admin"))&&(password.equals("123456"))) {
			request.getRequestDispatcher("/AdminPanel.jsp").forward(request, response);		
	}else {
		while ((line = br.readLine()) != null) {//// Прочтите каждую строку br и обновляйте строку каждый раз
			if (line.equals("un" + login)) {// Находим правильное имя пользователя

				if (br.readLine().equals("pw" + password)) {// Получив правильное имя пользователя, оцениваем
															// правильность пароля
					request.setAttribute("massage", "");
					request.getRequestDispatcher("/index.jsp").forward(request, response);					
					b = 1;
					break;
				} else {
					// String path=request.getContextPath()+"/Login.jsp";
					// response.sendRedirect(path);
					request.setAttribute("massage", "Неверное имя пользователя или пароль");
					request.getRequestDispatcher("/Login.jsp").forward(request, response);

					break;
				}
			}
		}

		// br.close();
		if (b == 0) {
			request.setAttribute("massage", "Неверное имя пользователя или пароль");
			request.getRequestDispatcher("/Login.jsp").forward(request, response);

		}
	}
	}
}
