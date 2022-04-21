package kurs24;

import java.io.*;

public class read {
  
    public static void main(String[] args) {
 
        try(FileInputStream fin=new FileInputStream("/TestCourse/src/main/java/resources/logs.txt"))
        {
            System.out.printf("File size: %d bytes \n", fin.available());
              
            int i=-1;
            while((i=fin.read())!=-1){
              
                System.out.print((char)i);
            }   
        }
        catch(IOException ex){
              
            System.out.println(ex.getMessage());
        } 
    }
}

