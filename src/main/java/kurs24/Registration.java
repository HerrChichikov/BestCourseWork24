package kurs24;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;


/**
 * Servlet implementation class Registration
 */
@WebServlet("/Registration")
public class Registration extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Registration() {
        super();

    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.getWriter().append("Served at: ").append(request.getContextPath());
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
		throws ServletException, IOException, FileNotFoundException{
	          
	        response.setContentType("text/html");
	        PrintWriter writer = response.getWriter();
	 
	        String login = request.getParameter("login");
	        String password = request.getParameter("password");
	        
	        
	       File file = new File("logs");
	       PrintWriter pw = new PrintWriter(file);
	       pw.println(login);
	       pw.println(password);
	 
	        try {
	            writer.println("<p>Name: " + login + "</p>");
	            writer.println("<p>Name: " + password + "</p>");

	        } finally {
	            writer.close();  
	 	       pw.close();
	        }
	    }
	}



