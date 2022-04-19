package kurs24;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name="Login", urlPatterns="/Login")
public class Login extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		LoginCheck log =LoginCheck.fromRequestParameters(request);
		log.setAsRequestAttributesAndCheck(request);
			RequestDispatcher dispatcher = request.getRequestDispatcher("/index.jsp");
			dispatcher.forward(request, response);

}
	
	private static class LoginCheck{
		private String login;
		private String password;
		private String result;
		
		private LoginCheck(String login, String password){
		this.login=login;
		this.password=password;
		}
		
		public static LoginCheck fromRequestParameters(HttpServletRequest request) {
			return new LoginCheck(
					request.getParameter("login"),
					request.getParameter("password"));	
		}
		
		public void setAsRequestAttributesAndCheck(HttpServletRequest request) {
			request.setAttribute("login", login);
			request.setAttribute("password", password);
			String first_try;
			int second_try;
				first_try=login;
				second_try=Integer.parseInt(password);
				if (first_try=="hi" | second_try==1234) {
				result= "Успех";}
					
			request.setAttribute("result", result);
		}
		
	}
	}
