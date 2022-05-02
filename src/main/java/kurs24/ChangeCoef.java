package kurs24;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Coefficient
 */

@WebServlet(name = "ChangeCoef", urlPatterns = "/ChangeCoef")

public class ChangeCoef extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ChangeCoef() {
        super();
        // TODO Auto-generated constructor stub
    }
    public static void WriteInFile(File file,String str) {
        
        try {
              FileWriter fw = new FileWriter(file,true);
              fw.write(str+"\n");
              fw.close();
        } catch (IOException e) {
              e.printStackTrace();
        }
    }
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
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
		
		
		}
	}

}
