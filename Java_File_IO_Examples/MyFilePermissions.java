package com.java2novice.files;
 
import java.io.File;
 
public class MyFilePermissions {
 
    public static void main(String a[]){
         
        File scriptFile = new File("/home/java2novice/test.sh");
        System.out.println("Current file permissions:");
        System.out.println("Can Execute? "+scriptFile.canExecute());
        System.out.println("Can Read? "+scriptFile.canRead());
        System.out.println("Can Write? "+scriptFile.canWrite());
        scriptFile.setExecutable(true);
        scriptFile.setReadable(true);
        scriptFile.setWritable(true);
        System.out.println("Now file permissions:");
        System.out.println("Can Execute? "+scriptFile.canExecute());
        System.out.println("Can Read? "+scriptFile.canRead());
        System.out.println("Can Write? "+scriptFile.canWrite());
    }
}