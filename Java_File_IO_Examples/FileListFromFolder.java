package com.java2novice.files;
 
import java.io.File;
 
public class FileListFromFolder {
     
    public static void main(String a[]){
        File file = new File("C:/MyFolder/");
        String[] fileList = file.list();
        for(String name:fileList){
            System.out.println(name);
        }
    }
}