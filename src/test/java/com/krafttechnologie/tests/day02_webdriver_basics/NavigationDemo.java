package com.krafttechnologie.tests.day02_webdriver_basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationDemo {
    public static void main(String[] args) throws InterruptedException {

        //selenium is ready to talk with chrome
        WebDriverManager.chromedriver().setup();

        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.google.com");

        Thread.sleep(3000);

//      navigate() is another method that takes us to the target website
        driver.navigate().to("https://amazon.com");

        Thread.sleep(3000);

//      getting back
        driver.navigate().back();

//      going forward
        driver.navigate().forward();

        Thread.sleep(3000);

        driver.navigate().refresh();







    }
}
