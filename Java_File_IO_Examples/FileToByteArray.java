package com.java2novice.files;
 
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
 
/**
 * Reading contents from a file into byte array.
 *
 */
public class FileToByteArray {
 
    public static void main(String a[]){
         
        String fileName = "C:/MyFile.txt";
        InputStream is = null;
        try {
            is = new FileInputStream(fileName);
            byte content[] = new byte[2*1024];
            int readCount = 0;
            while((readCount = is.read(content)) > 0){
                System.out.println(new String(content, 0, readCount-1));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try{
                if(is != null) is.close();
            } catch(Exception ex){
                 
            }
        }
    }
}