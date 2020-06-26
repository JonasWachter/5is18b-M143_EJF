package com.java2novice.files;
 
import java.io.File;
import java.io.IOException;
 
public class MyTmpFile {
 
    public static void main(String a[]){
         
        File tmpFile = null;
        try {
            tmpFile = File.createTempFile("MyTempFile", ".tmp");
            System.out.println("Created Temp File Location : " + tmpFile.getAbsolutePath());
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } 
    }
}