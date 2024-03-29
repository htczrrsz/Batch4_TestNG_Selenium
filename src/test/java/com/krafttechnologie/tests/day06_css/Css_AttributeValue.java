package com.krafttechnologie.tests.day06_css;

import com.krafttechnologie.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Css_AttributeValue {
    public static void main(String[] args) throws InterruptedException {

        //go to https://www.krafttechexlab.com/login
        //locate the email box with attribute-value by using css syntax
        //locate the password box with attribute-value by using css syntax



//      Third Formula
//      [attribute='value']

        WebDriver driver= WebDriverFactory.getDriver("safari");
        driver.get("https://www.krafttechexlab.com/login");
        Thread.sleep(2000);

        WebElement emailBox= driver.findElement(By.cssSelector("input[name='email']"));
        emailBox.sendKeys("test@test.com");

        Thread.sleep(2000);

        WebElement passwordBox= driver.findElement(By.cssSelector("[name='password']"));
        passwordBox.sendKeys("test123");
        Thread.sleep(2000);


        driver.quit();



    }
}
