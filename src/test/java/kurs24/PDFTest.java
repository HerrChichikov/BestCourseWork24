package kurs24;
import static org.junit.Assert.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.junit.Test;

import com.itextpdf.text.BadElementException;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

public class PDFTest {

	@Test
	public void test() throws IOException, DocumentException {
		Create();
		String filepath = new File("").getCanonicalPath();
		String[] parsfilepath = filepath.split("/");
		
		int lengthpath = parsfilepath.length;
		String abspath=""; 
		for(int i=0;i<(lengthpath-1);i++) {
			abspath=abspath+parsfilepath[i]+"/";
		}
		filepath=abspath+"BestCourseWork24/src/main/webapp/Check.pdf";
		if (!Files.exists(Paths.get(filepath))) {
			fail("pdf файл не существует" + filepath);
	}
		
}
	public static void Create() throws IOException, DocumentException {
  	
	Document document = new Document();
	
	String filepath = new File("").getCanonicalPath();
	String[] parsfilepath = filepath.split("/");
	
	int lengthpath = parsfilepath.length;
	String abspath=""; 
	for(int i=0;i<(lengthpath-1);i++) {
		abspath=abspath+parsfilepath[i]+"/";
	}
	filepath=abspath+"BestCourseWork24/src/main/webapp/Check.pdf";

	String fontpath =abspath+"BestCourseWork24/src/main/webapp/fonts/times.ttf";
	
	try {	
		PdfWriter.getInstance(document, new FileOutputStream(filepath));
	} catch (FileNotFoundException | DocumentException e) {
		e.printStackTrace();
	}
				
	document.open(); 
	
	BaseFont times = null;
	try {
		times = BaseFont.createFont(fontpath, "cp1251", BaseFont.EMBEDDED);
	} catch (DocumentException | IOException e) {
		e.printStackTrace();
	}
	
	String string_pdf = "Информация по генерации PDF документа.";
	Paragraph paragraph = new Paragraph();
    paragraph.add(new Paragraph(string_pdf, new Font(times,14)));
    document.add(paragraph);
    document.close(); 
}
}
