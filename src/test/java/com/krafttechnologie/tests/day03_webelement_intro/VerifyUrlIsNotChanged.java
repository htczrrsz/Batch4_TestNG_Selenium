package com.krafttechnologie.tests.day03_webelement_intro;

import com.krafttechnologie.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VerifyUrlIsNotChanged {
    public static void main(String[] args) throws InterruptedException {

        /**  Class Task
         * open Chrome Browser
         * go to  https://www.krafttechexlab.com/login   page
         * click on login button
         * verify that url is not changed
         */

        WebDriver driver = WebDriverFactory.getDriver("chrome"); // empty browser
        driver.get("https://www.krafttechexlab.com/login");
        Thread.sleep(3000);

        String expectedUrl = driver.getCurrentUrl();
        System.out.println("expectedUrl = " + expectedUrl);

//        click on login button
        WebElement loginBttn = driver.findElement(By.cssSelector(" [type=\"submit\"]"));
        loginBttn.click();

        String actualUrl= driver.getCurrentUrl();
        System.out.println("actualUrl = " + actualUrl);

        if (expectedUrl.equals(actualUrl)){
            System.out.println("pass");
        }else{
            System.out.println("fail");
        }

        Thread.sleep(3000);

        driver.close();

    }
}
