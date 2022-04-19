package kurs24;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;


/**
 * Servlet implementation class CalcSum
 */
@WebServlet("/CalcSum")
public class CalcSum extends HttpServlet {
	private static final long serialVersionUID = 1L;
	String first;

	/*
	 * private static class RequestCalc { private String first_calc; private String
	 * second_calc; private double result; private int meters;
	 * 
	 * public void Calculate (int x, int y, int a, int b, int c) { result = (x*y*a +
	 * c *(x/2))*1.8 + b); }
	 * 
	 * public void CoefficentsCount(int meb, int raz, int tip, int cat, int nap, int
	 * D) { if (meb == 1) { if (raz == 1) { meters = 8; } if (raz == 2) { meters =
	 * 11; } if (raz == 3) { meters = 15; } }
	 * 
	 * if (meb == 2) { if (raz == 1) { meters = 14; } if (raz == 2) { meters = 18; }
	 * if (raz == 3) { meters = 22; } if (raz == 4) { meters = 22; } if (raz == 5) {
	 * meters = 26; } } if (meb == 3) { meters = 14; } if (meb == 4) { meters = 3; }
	 * if (meb == 5) { meters = 4; } if (meb == 6) { meters = 6; } if (meb == 7) {
	 * meters = 3; } if (meb == 8) { meters = 2; } if (tip == 1) { if (cat == 1) {
	 * Cena = 210; } if (cat == 2) { Cena = 490; } if (cat == 3) { Cena = 910; } }
	 * if (tip == 2) { if (cat == 1) { Cena = 803; } if (cat == 2) { Cena = 1355; }
	 * if (cat == 3) { Cena = 2300; } } if (tip == 3) { if (cat == 1) { Cena = 320;
	 * } if (cat == 2) { Cena = 720; } if (cat == 3) { Cena = 1662; } } if (nap ==
	 * 1) { Nap = 1.1; } else { Nap = 1.2; } if (D == 1) { Dost = 300; } if (D == 2)
	 * { Dost = 600; } if (D == 3) { Dost = 0; } } }
	 */

	public CalcSum() {
        super();

    }

		protected void doGet(HttpServletRequest request, HttpServletResponse response)
				throws ServletException, IOException {

			response.getWriter().append("Served at: ").append(request.getContextPath());
		}

		protected void doPost(HttpServletRequest request, HttpServletResponse response)
				throws ServletException, IOException {

			String type = request.getParameter("type");
			String size = request.getParameter("size");
			String material = request.getParameter("material");
			String category = request.getParameter("category");
			String filler = request.getParameter("filler");
			String delivery = request.getParameter("delivery");
			
			first = request.getParameter("type");
			PrintWriter pw = response.getWriter();
			pw.println("hoho"+first);
			

			/*
			 * RequestDispatcher dispatcher = request.getRequestDispatcher("/Results.jsp");
			 * dispatcher.forward(request, response);
			 */
		}

}
