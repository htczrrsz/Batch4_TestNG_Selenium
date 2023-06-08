package com.krafttechnologie.tests.day03_webelement_intro;

import com.krafttechnologie.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VerifyUserNameIsCorrect {
    public static void main(String[] args) {

        /** Class Task 2
         * open Chrome Browser
         * go to  https://www.krafttechexlab.com/login   page
         * enter email as    --> mike@gmail.com
         * enter password as --> mike1234
         * click login button
         * verify that username is "mike"
         * // verify that name page is "Dashboard"
         */

        String email = "mike@gmail.com";
        String password = "mike1234";
        String expectedProfileUsername = "mike";

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.krafttechexlab.com/login");
//      enter email --> lazy way
        driver.findElement(By.id("email")).sendKeys(email);
//      enter password
        driver.findElement(By.id("yourPassword")).sendKeys(password);
//      click log in button
        driver.findElement(By.cssSelector(" [type=\"submit\"]")).click();

//      2 ways to get text from web element
//         1. getText() --> it will work
//         2. getAttribute("") --> second way of getting that especially

        WebElement profilUserName = driver.findElement(By.cssSelector("[class=\"d-none d-md-block dropdown-toggle ps-2\"]"));

        String actualProfileUserName = profilUserName.getText();
        System.out.println("actualProfileUserName = " + actualProfileUserName);

        if (expectedProfileUsername.equals(actualProfileUserName)) {
            System.out.println("pass");
        } else {
            System.out.println("fail");
        }


        driver.close();
    }
}
