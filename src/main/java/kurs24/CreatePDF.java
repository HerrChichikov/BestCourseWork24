package kurs24;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.stream.Stream;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itextpdf.text.BadElementException;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

import kurs24.CalcSum.RequestCalc;


public class CreatePDF {
	
	private static BaseFont times = null;

	
	
    public static void Create(String a,String b, String c, String d, String f, String g, String j) throws IOException {
      	
    	Document document = new Document();
    	
    	String filepath = new File("").getCanonicalPath();
		String[] parsfilepath = filepath.split("/");
		
		int lengthpath = parsfilepath.length;
		String abspath=""; 
		for(int i=0;i<(lengthpath-1);i++) {
			abspath=abspath+parsfilepath[i]+"/";
		}
		filepath=abspath+"webapps/Calculate/Check.pdf";
				
		String imagepath=abspath+"webapps/Calculate/picture/ugatu.png";
		String imagepath2=abspath+"webapps/Calculate/picture/raysmall.png";
		String fontpath =abspath+"webapps/Calculate/fonts/times.ttf";
    	
		try {	
			PdfWriter.getInstance(document, new FileOutputStream(filepath));
		} catch (FileNotFoundException | DocumentException e) {
			e.printStackTrace();
		}
					
		document.open(); 
		
		//BaseFont times = null;
		try {
			times = BaseFont.createFont(fontpath, "cp1251", BaseFont.EMBEDDED);
		} catch (DocumentException | IOException e) {
			e.printStackTrace();
		}
		
		String string_pdf = "Итоговая цена расчёта стоимости мягкой мебели";
		Paragraph paragraph = new Paragraph();
	    paragraph.add(new Paragraph(string_pdf, new  Font(times,18)));
	    
	    String string_pdf2 = "Для консультации обращайтесь по телефону: +79821724811";
	    paragraph.add(new Paragraph(string_pdf2, new Font(times,14)));
	

	    
	    try {
			document.add(paragraph);
		} catch (DocumentException e1) {
			e1.printStackTrace();
		}
	    
		 paragraph.clear();
		 String string_pdf3 = " ";
		 paragraph.add(new Paragraph(string_pdf3, new Font(times,14)));
		 
		 

		 
		 try {
				document.add(paragraph);
			} catch (DocumentException e1) {
				e1.printStackTrace();
			}
    	
	    
	    Image img = null;
		try {
			img = Image.getInstance(imagepath);
			
			
		} catch (BadElementException e2) {
			
			e2.printStackTrace();
		} catch (MalformedURLException e2) {
			
			e2.printStackTrace();
		} catch (IOException e2) {
			
			e2.printStackTrace();
		}
		
		img.setAbsolutePosition(90, 500); 
		
		try {
				document.add(img);
			} catch (DocumentException e) {
				e.printStackTrace();
			}
	    
		try {
			img = Image.getInstance(imagepath2);
			
			
		} catch (BadElementException e2) {
			
			e2.printStackTrace();
		} catch (MalformedURLException e2) {
			
			e2.printStackTrace();
		} catch (IOException e2) {
			
			e2.printStackTrace();
		}
		
		img.setAbsolutePosition(470, 740); 
		
		try {
				document.add(img);
			} catch (DocumentException e) {
				e.printStackTrace();
			}
		

		 paragraph.clear();
		 paragraph.add(new Paragraph(string_pdf3, new Font(times,14)));
		 
		 try {
				document.add(paragraph);
			} catch (DocumentException e1) {
				e1.printStackTrace();
			}
	    

		 PdfPTable table = new PdfPTable(7); 
		 addHeader(table);
		 addRows(table,a,b,c,d,f,g, j);
		 
		 try {
			document.add(table);
		} catch (DocumentException e) {
			e.printStackTrace();
		}
		 

		 
		 paragraph.clear();
  
	    document.close(); 
    }
    
private static void addRows(PdfPTable table, String a, String b, String c, String d, String f, String g, String j) {
		
		String cell1 = a;
		String cell2 = b;
		String cell3 = c;
		String cell4 = d;
		String cell5 = f;
		String cell6 = g;
		String cell7 = j;
				
		table.addCell((new Phrase(cell1, new Font(times,13))));
	    table.addCell((new Phrase(cell2, new Font(times,13))));    
	    table.addCell((new Phrase(cell3, new Font(times,13))));
	    table.addCell((new Phrase(cell4, new Font(times,13))));
	    table.addCell((new Phrase(cell5, new Font(times,13))));
	    table.addCell((new Phrase(cell6, new Font(times,13))));
	    table.addCell((new Phrase(cell7, new Font(times,13))));
		
	}

private static void addHeader(PdfPTable table) {
	Stream.of("Тип", "Размер", "Материал","Категория","Наполнитель", "Тип доставки", "Итоговая цена")
      .forEach(columnTitle -> {
        PdfPCell header = new PdfPCell();
        header.setBackgroundColor(BaseColor.LIGHT_GRAY);
        header.setBorderWidth(2);
        header.setPhrase(new Phrase(columnTitle, new Font(times,13)));
        table.addCell(header);
    });
}
}
