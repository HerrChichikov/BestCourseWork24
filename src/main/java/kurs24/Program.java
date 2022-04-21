package kurs24;

import java.io.*;

public class Program {
  
    public static void main(String[] args) {
          
        String text = "Hello world!"; // строка для записи
        try(FileOutputStream fos=new FileOutputStream("/TestCourse/src/main/java/resources/logs.txt"))
        {
            // перевод строки в байты
            byte[] buffer = text.getBytes();
              
            fos.write(buffer, 0, buffer.length);
            System.out.println("The file has been written");
        }
        catch(IOException ex){
              
            System.out.println(ex.getMessage());
        }
    }
}