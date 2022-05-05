package kurs24;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
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
	protected static double  meters;
	protected static double  deliveryPrice;
	protected static double  price;
	protected static double fillerCof;
	public String error = "";
	
	public static Double calculate(double  x, double y, double  a, double  c) {
		return ( x * y * a + x/2 *515)* 1.8 + c;
	}

	protected class RequestCalc {
		
		public void calculate(double  x, double y, double  a, double  c) {
			result =( x * y * a + x/2 *515)* 1.8 + c;
		}
		
		public void countCoef(String meb, String raz, String tip, String cat, String nap, String D) throws IOException {
			double[] coef = new double[29];
			String filepath = new File("").getCanonicalPath();
			String[] parsfilepath = filepath.split("/");
			int lengthpath = parsfilepath.length;
			String abspath = "";
			for (int i = 0; i < (lengthpath - 1); i++) {
			abspath = abspath + parsfilepath[i] + "/";
			}
			filepath = abspath + "webapps/Calculate/Coef.txt";
			File file = new File(filepath);
			FileInputStream fis = new FileInputStream(file);
			InputStreamReader isr = new InputStreamReader(fis,"utf-8");
			BufferedReader br = new BufferedReader(isr);
			String line = "";
			for(int i =0; i < 29; i+=1) {
			line = br.readLine();
			coef[i]=Double.parseDouble(line);
			error = error + coef[i];
			}
			if (meb.equals(IndexArrays.types[0])) {
				if (raz.equals(IndexArrays.sizes[0])) {
					meters = coef[0];
				}
				if (raz.equals(IndexArrays.sizes[1])) {
					meters = coef[1];
				}
				if (raz.equals(IndexArrays.sizes[2])) {
					meters = coef[2];
				}
			}
			if (meb.equals(IndexArrays.types[1])) {
				if (raz.equals(IndexArrays.sizes[0])) {
					meters = coef[3];
				}
				if (raz.equals(IndexArrays.sizes[1])) {
					meters = coef[4];
				}
				if (raz.equals(IndexArrays.sizes[2])) {
					meters = coef[5];
				}
//				
			}
			if (meb.equals(IndexArrays.types[2])) {
				if (raz.equals(IndexArrays.sizes[0])) {
					meters = coef[6];
				}
				if (raz.equals(IndexArrays.sizes[1])) {
					meters = coef[7];
				}
				if (raz.equals(IndexArrays.sizes[2])) {
					meters = coef[8];
				}
			}
			if (meb.equals(IndexArrays.types[3])) {
				if (raz.equals(IndexArrays.sizes[0])) {
					meters = coef[9];
				}
				if (raz.equals(IndexArrays.sizes[1])) {
					meters = coef[10];
				}
				if (raz.equals(IndexArrays.sizes[2])) {
					meters = coef[11];
				}
			}
//				
			if (tip.equals(IndexArrays.materials[0])) {
				if (cat.equals(IndexArrays.categories[0])) {
					price = coef[12];
				}
				if (cat.equals(IndexArrays.categories[1])) {
					price = coef[13];
				}
				if (cat.equals(IndexArrays.categories[2])) {
					price = coef[14];
				}
			}
			if (tip.equals(IndexArrays.materials[1])) {
				if (cat.equals(IndexArrays.categories[0])) {
					price = coef[15];
				}
				if (cat.equals(IndexArrays.categories[1])) {
					price = coef[16];
				}
				if (cat.equals(IndexArrays.categories[2])) {
					price = coef[17];
				}
			}
			if (tip.equals(IndexArrays.materials[2])) {
				if (cat.equals(IndexArrays.categories[0])) {
					price = coef[18];
				}
				if (cat.equals(IndexArrays.categories[1])) {
					price = coef[19];
				}
				if (cat.equals(IndexArrays.categories[2])) {
					price = coef[20];
				}
			}
			if (tip.equals(IndexArrays.materials[3])) {
				if (cat.equals(IndexArrays.categories[0])) {
						price = coef[21];
				}
				if (cat.equals(IndexArrays.categories[1])) {
						price = coef[22];
				}
				if (cat.equals(IndexArrays.categories[2])) {
						price = coef[23];
				}	
			}
			if (nap.equals(IndexArrays.fillers[0])) {
				fillerCof = coef[24];
			} else {
				fillerCof =coef[25];
			}
			if (D.equals(IndexArrays.deliveries[0])) {
				deliveryPrice = coef[26];
			}
			if (D.equals(IndexArrays.deliveries[1])) {
				deliveryPrice = coef[27];
			}
			if (D.equals(IndexArrays.deliveries[2])) {
				deliveryPrice = coef[28];
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
		request.setAttribute("error", price);

		//RequestDispatcher dispatcher = request.getRequestDispatcher("/Results.jsp");
		//dispatcher.forward(request, response);
		request.getRequestDispatcher("/Results.jsp").forward(request, response);
	}

}