package com.java2novice.files;
 
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
 
public class ByteArrToInputStream {
 
    public static void main(String a[]){
         
        String str = "converting to input stream";
        byte[] content = str.getBytes();
        int size = content.length;
        InputStream is = null;
        byte[] b = new byte[size];
        try {
            is = new ByteArrayInputStream(content);
            is.read(b);
            System.out.println("Data Recovered: "+new String(b));
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try{
                if(is != null) is.close();
            } catch (Exception ex){
                 
            }
        }
         
    }
}