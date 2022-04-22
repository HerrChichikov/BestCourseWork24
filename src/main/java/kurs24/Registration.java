package kurs24;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itextpdf.text.Document;

import java.io.PrintWriter;

/**
 * Servlet implementation class Registration
 */
@WebServlet(name = "Registration", urlPatterns = "/Registration")
public class Registration extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public static class User {
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
	public static boolean IsUserExist(File file , String username) throws IOException {
        boolean flag = false;
        try {
              FileInputStream fis = new FileInputStream(file);
              InputStreamReader isr = new InputStreamReader(fis,"utf-8");
              BufferedReader br = new BufferedReader(isr);
              
              String line = "";
              while((line = br.readLine())!=null) {// Читаем каждую строку br и обновляем строку каждый раз
                     if(line.equals("un"+username)) {
                           flag = true;
                           break;
                     }            
              }
              br.close();                                                // Завершаем доступ к файлу
              isr.close();
              fis.close();
             } catch (FileNotFoundException e) {
                   e.printStackTrace();
             }
             
             return flag;
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
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException, FileNotFoundException {
		
    	String filepath = new File("").getCanonicalPath();
		String[] parsfilepath = filepath.split("/");
		int lengthpath = parsfilepath.length;
		String abspath=""; 
		for(int i=0;i<(lengthpath-1);i++) {
			abspath=abspath+parsfilepath[i]+"/";
		}
		filepath=abspath+"webapps/Calculate/logs.txt";		
		User user = new User();
		user.setLogin(request.getParameter("login"));
		user.setPassword(request.getParameter("password"));
		user.getLogin();
		user.getPassword();
		File file = new File(filepath);
		String login = user.getLogin();
		String password = user.getPassword();
		request.setCharacterEncoding("UTF-8");
		if (!IsUserExist(file,login)) {// Определяем, существует ли имя пользователя
			WriteInFile(file, "un"+password);// Записываем имя пользователя
            WriteInFile(file, "pw"+password);// Записываем пароль
            request.setAttribute("message","");
            request.getRequestDispatcher("/Login.jsp").forward(request, response);		
		}else {
			request.setAttribute("message","Введенное имя пользователя уже существует");
			request.getRequestDispatcher("/RegistrationJSP.jsp").forward(request, response);	
		}

//        RequestDispatcher dispatcher = request.getRequestDispatcher("/index.jsp");
// 	    dispatcher.forward(request, response);
		
	}
	
}
