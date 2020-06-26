package com.java2novice.files;
 
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
 
public class ByteWriteToFile {
 
    public static void main(String[] args) {
         
        OutputStream opStream = null;
        try {
            String strContent = "This example shows how to write byte content to a file";
            byte[] byteContent = strContent.getBytes();
            File myFile = new File("C:/MyTestFile.txt");
            // check if file exist, otherwise create the file before writing
            if (!myFile.exists()) {
                myFile.createNewFile();
            }
            opStream = new FileOutputStream(myFile);
            opStream.write(byteContent);
            opStream.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally{
            try{
                if(opStream != null) opStream.close();
            } catch(Exception ex){
                 
            }
        }
    }
}