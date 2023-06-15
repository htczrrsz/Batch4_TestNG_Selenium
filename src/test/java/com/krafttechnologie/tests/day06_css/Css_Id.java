package com.krafttechnologie.tests.day06_css;

import com.krafttechnologie.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Css_Id {
    public static void main(String[] args) throws InterruptedException {

        //go to https://www.krafttechexlab.com/login
        //locate the email box with id by using css syntax
        //send "test@test.com" into the box


        WebDriver driver= WebDriverFactory.getDriver("safari");
        driver.get("https://www.krafttechexlab.com/login");
        Thread.sleep(2000);

        // First Formula
        // #id
        // tagname#id

        WebElement emailButton= driver.findElement(By.cssSelector("#email"));
        emailButton.sendKeys("test@test.com");
        Thread.sleep(2000);

//      second way
        WebElement emailButton1= driver.findElement(By.cssSelector("input#email"));
        emailButton1.sendKeys("test1@test.com");
        Thread.sleep(2000);

        driver.quit();





    }
}
