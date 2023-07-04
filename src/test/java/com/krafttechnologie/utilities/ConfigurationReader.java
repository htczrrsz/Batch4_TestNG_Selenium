package com.krafttechnologie.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigurationReader {

   private static Properties properties;

   static {
       try{
           // what file to read
           String path="configuration.properties";
           // read to file into java, finds the file using path
           FileInputStream input = new FileInputStream(path);
           //properties --> class that store properties in key & value format
           properties= new Properties();
           // the values from the file input is loaded/ fed in to the properties object
           properties.load(input);
           input.close();
       }catch (Exception e){
           e.printStackTrace();
       }
   }


    public static String get(String keyName){
        return properties.getProperty(keyName);
    }


}



//    static {
//        File src= new File("configuration.properties");
//        try{
//            FileInputStream input = new FileInputStream(src);
//            properties= new Properties();
//            properties.load(input);
//            input.close();
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//    }


