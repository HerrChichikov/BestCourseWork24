package kurs24;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "PDF", urlPatterns = "/PDF")
public class PDF extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	//	CreatePDF.Create();

		RequestDispatcher dispatcher = request.getRequestDispatcher("/Results.jsp");
		dispatcher.forward(request, response);

	}
}
