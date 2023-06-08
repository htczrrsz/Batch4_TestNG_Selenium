package com.krafttechnologie.tests.day03_webelement_intro;

import com.krafttechnologie.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VerifyUrlChanged {
    public static void main(String[] args) throws InterruptedException {

        /** Class Task 2
         * open Chrome Browser
         * go to  https://www.krafttechexlab.com/login   page
         * enter email as    --> mike@gmail.com
         * enter password as --> mike1234
         * click login button
         * verify that url has changed
         */

        String email="mike@gmail.com";
        String password= "mike1234";

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("https://www.krafttechexlab.com/login");
//      enter email --> sendKeys()
        WebElement emailInputBox= driver.findElement(By.id("email"));
        emailInputBox.sendKeys(email);

//      enter password -> sendKeys()
        WebElement passwordInputBox=driver.findElement(By.id("yourPassword"));
        passwordInputBox.sendKeys(password);

//      click login button
        WebElement loginButton = driver.findElement(By.cssSelector("[type=\"submit\"]"));
        loginButton.click();

        Thread.sleep(2000);

        String expectedUrl="https://www.krafttechexlab.com/index";
        String actualUrl= driver.getCurrentUrl();
        System.out.println("expectedUrl = " + expectedUrl);
        System.out.println("actualUrl = " + actualUrl);
        if (expectedUrl.equals(actualUrl)){
            System.out.println("pass");
        }else{
            System.out.println("fail");
        }


//        Thread.sleep(2000);
//        driver.close();



    }
}
