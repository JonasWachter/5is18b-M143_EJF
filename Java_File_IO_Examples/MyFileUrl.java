package com.java2novice.files;
 
import java.io.File;
 
public class MyFileUrl {
     
    public static void main(String a[]){
        File f = new File("C:/TestForm.txt");
        System.out.println(f.toURI());
    }
}