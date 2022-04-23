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
@WebServlet("/CalcSum")
public class CalcSum extends HttpServlet {
	
	protected static final long serialVersionUID = 1L;
	protected static double result;
	protected static int meters;
	protected static int deliveryPrice;
	protected static int price;
	protected static double fillerCof;


	protected static class RequestCalc {

		
		public static void calculate (int x, double y, int a, int b, int c) {
			result = (x*y*a +c *(x/2))*1.8 + b; }
		
		public static void countCoef(int meb, int raz, int tip, int cat, int nap, int D) {
			if (meb == 1) {
				if (raz == 1) {
				meters = 8;
				}
				if (raz == 2) {
				meters = 11;
				}
				if (raz == 3) {
				meters = 15;
				}
				}
				if (meb == 2) {
				if (raz == 1) {
				meters = 14;
				}
				if (raz == 2) {
				meters = 18;
				}
				if (raz == 3) {
				meters = 22;
				}
				if (raz == 4) {
				meters = 22;
				}
				if (raz == 5) {
				meters = 26;
				}
				}
				if (meb == 3) {
				meters = 14;
				}
				if (meb == 4) {
				meters = 3;
				}
				if (meb == 5) {
				meters = 4;
				}
				if (meb == 6) {
				meters = 6;
				}
				if (meb == 7) {
				meters = 3;
				}
				if (meb == 8) {
				meters = 2;
				}
				if (tip == 1) {
				if (cat == 1) {
				price = 210;
				}
				if (cat == 2) {
				price = 490;
				}
				if (cat == 3) {
				price = 910;
				}
				}
				if (tip == 2) {
				if (cat == 1) {
				price = 803;
				}
				if (cat == 2) {
				price = 1355;
				}
				if (cat == 3) {
				price = 2300;
				}
				}
				if (tip == 3) {
				if (cat == 1) {
				price = 320;
				}
				if (cat == 2) {
				price = 720;
				}
				if (cat == 3) {
				price = 1662;
				}
				}
				if (nap == 1) {
				fillerCof = 1.1;
				} else {
				fillerCof = 1.2;
				}
				if (D == 1) {
				deliveryPrice = 300;
				}
				if (D == 2) {
				deliveryPrice = 600;
				}
				if (D == 3) {
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

		String type = request.getParameter("type");
		int size = Integer.parseInt(request.getParameter("size"));
		int material = Integer.parseInt(request.getParameter("material"));
		int category = Integer.parseInt(request.getParameter("category"));
		int filler = Integer.parseInt(request.getParameter("filler"));
		int delivery = Integer.parseInt(request.getParameter("delivery"));
		CreatePDF.Create(type);
		RequestCalc calc = new RequestCalc();
		//calc.countCoef(type,size,material,category,filler,delivery);
		calc.calculate(meters, fillerCof,price,delivery,deliveryPrice);
		request.setAttribute("result", result);
		request.setAttribute("type", type);                 // 
		request.setAttribute("size", size);					//
		request.setAttribute("material", material);       	//			нужно будет подумать 
		request.setAttribute("category", category);			//
		request.setAttribute("filler", filler);				//
		request.setAttribute("delivery", delivery);			//
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/Results.jsp");
		dispatcher.forward(request, response);

	}

}
