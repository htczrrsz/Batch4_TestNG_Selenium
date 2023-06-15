package com.krafttechnologie.tests.day06_css;

import com.krafttechnologie.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Css_Siblings {
    public static void main(String[] args) throws InterruptedException {


        // locate the email box using sibling with css syntax

//      formula
//      cssSyntax~tagName

        WebDriver driver= WebDriverFactory.getDriver("safari");
        driver.get("https://www.krafttechexlab.com/login");
        Thread.sleep(2000);

        WebElement emailBox = driver.findElement(By.cssSelector("label[for='email']~input"));
        emailBox.sendKeys("test@test.com");
        Thread.sleep(2000);

        driver.quit();



    }
}
