package com.krafttechnologie.tests.day14_properties_singleton;

import com.krafttechnologie.utilities.ConfigurationReader;
import com.krafttechnologie.utilities.Driver;
import com.krafttechnologie.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class SingletonTest {


//    @Test
//    public void test1(){
//        WebDriver driver1= WebDriverFactory.getDriver("chrome");
//        driver1.get("https://www.amazon.com/");
//        WebDriver driver2= WebDriverFactory.getDriver("chrome");
////      driver2.findElement(By.cssSelector("#twotabsearchtextbox"));
//    }
//
//    @Test
//    public void test2(){
//      //  Singleton singleton= new Singleton();  --> obje olusmaz,cunku private
//        String s1=Singleton.getInstance();
//        String s2=Singleton.getInstance();
//
//        System.out.println("s1 = " + s1);
//        System.out.println("s2 = " + s2);
//
//    }
//
//
//    @Test
//    public void test3(){
////        WebDriver driver= WebDriverFactory.getDriver("chrome");
//        WebDriver driver= Driver.get();
//        driver.get("https://www.amazon.com/");
//        driver.get(ConfigurationReader.get("url"));
//    }


    @Test
    public void test4(){
//        WebDriver driver=WebDriverFactory.getDriver("chrome");
        WebDriver driver=Driver.get();
        driver.get("https://www.google.com/");
//        Driver.get().get("https://www.google.com/");  --> lazy way
//        Driver.closeDriver();
    }



    @Test
    public void test5(){
//        WebDriver driver=WebDriverFactory.getDriver("chrome");
        WebDriver driver= Driver.get();
        driver.get("https://www.amazon.com/");
    }




}
