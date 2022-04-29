package kurs24;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CalcSum
 */

@WebServlet(name = "CalcSum", urlPatterns = "/CalcSum")
public class CalcSum extends HttpServlet {

	protected static final long serialVersionUID = 1L;
	protected static double result;
	protected static int meters;
	protected static int deliveryPrice;
	protected static int price;
	protected static double fillerCof;

	protected class RequestCalc {

		public void calculate(int x, double y, int a, int c) {
			result = x * y * a + c * (x / 2) * 1.8;
		}

		public void countCoef(String meb, String raz, String tip, String cat, String nap, String D) {
			if (meb.equals(IndexArrays.types[0])) {
				if (raz.equals(IndexArrays.sizes[0])) {
					meters = 8;
				}
				if (raz.equals(IndexArrays.sizes[1])) {
					meters = 11;
				}
				if (raz.equals(IndexArrays.sizes[2])) {
					meters = 15;
				}
			}
			if (meb.equals(IndexArrays.types[1])) {
				if (raz.equals(IndexArrays.sizes[0])) {
					meters = 14;
				}
				if (raz.equals(IndexArrays.sizes[1])) {
					meters = 18;
				}
				if (raz.equals(IndexArrays.sizes[2])) {
					meters = 22;
				}
//				if (raz == 4) {
//				meters = 22;
//				}
//				if (raz == 5) {
//				meters = 26;
//				}
			}
			if (meb.equals(IndexArrays.types[2])) {
				meters = 14;
			}
			if (meb.equals(IndexArrays.types[3])) {
				meters = 3;
			}
//				if (meb == 5) {
//				meters = 4;
//				}
//				if (meb == 6) {
//				meters = 6;
//				}
//				if (meb == 7) {
//				meters = 3;
//				}
//				if (meb == 8) {
//				meters = 2;
//				}
			if (tip.equals(IndexArrays.materials[0])) {
				if (cat.equals(IndexArrays.categories[0])) {
					price = 210;
				}
				if (cat.equals(IndexArrays.categories[1])) {
					price = 490;
				}
				if (cat.equals(IndexArrays.categories[2])) {
					price = 910;
				}
			}
			if (tip.equals(IndexArrays.materials[1])) {
				if (cat.equals(IndexArrays.categories[0])) {
					price = 803;
				}
				if (cat.equals(IndexArrays.categories[1])) {
					price = 1355;
				}
				if (cat.equals(IndexArrays.categories[2])) {
					price = 2300;
				}
			}
			if (tip.equals(IndexArrays.materials[2])) {
				if (cat.equals(IndexArrays.categories[0])) {
					price = 320;
				}
				if (cat.equals(IndexArrays.categories[1])) {
					price = 720;
				}
				if (cat.equals(IndexArrays.categories[2])) {
					price = 1662;
				}
			}
			if (nap.equals(IndexArrays.fillers[0])) {
				fillerCof = 1.1;
			} else {
				fillerCof = 1.2;
			}
			if (D.equals(IndexArrays.deliveries[0])) {
				deliveryPrice = 300;
			}
			if (D.equals(IndexArrays.deliveries[1])) {
				deliveryPrice = 600;
			}
			if (D.equals(IndexArrays.deliveries[2])) {
				deliveryPrice = 0;
			}
		}
	}

	public CalcSum() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String type = request.getParameter("type");
		String size = request.getParameter("size");
		String material = request.getParameter("material");
		String category = request.getParameter("category");
		String filler = request.getParameter("filler");
		String delivery = request.getParameter("delivery");

		CreatePDF.Create(type, size, material, category, filler, delivery);
		RequestCalc calc = new RequestCalc();

		calc.countCoef(type, size, material, category, filler, delivery);
		calc.calculate(meters, fillerCof, price, deliveryPrice);
		request.setAttribute("result", result);
		request.setAttribute("delivery", delivery);

		RequestDispatcher dispatcher = request.getRequestDispatcher("/Results.jsp");
		dispatcher.forward(request, response);

	}

}
