package com.java2novice.files;
 
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
 
 
public class ClassLoaderFileLoading {
 
    private static Properties appProp = null;
     
    static {
        try{
            InputStream is =
                ClassLoaderFileLoading.class.getResourceAsStream("/FileName.properties");
            appProp = new Properties();
            appProp.load(is);
        } catch(IOException ex){
            ex.printStackTrace();
        } catch(Exception ex){
            ex.printStackTrace();
        }
    }
}