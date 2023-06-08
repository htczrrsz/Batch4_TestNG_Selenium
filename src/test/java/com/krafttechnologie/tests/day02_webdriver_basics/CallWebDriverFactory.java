package com.krafttechnologie.tests.day02_webdriver_basics;

import com.krafttechnologie.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;

public class CallWebDriverFactory {

    //TASK
    //go to "https://www.krafttechexlab.com/" with chrome by using getDriver() method
    //verify that the url is "https://www.krafttechexlab.com/"


    public static void main(String[] args) throws InterruptedException {

        WebDriver driver= WebDriverFactory.getDriver("safari"); // chrome
        driver.get("https://www.krafttechexlab.com");
        driver.manage().window().maximize();

        Thread.sleep(3000);

        String expectedUrl= "https://www.krafttechexlab.com/";
        String actualUrl= driver.getCurrentUrl();

        if (actualUrl.equals(expectedUrl)){
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
        }

        driver.quit();
    }


}
