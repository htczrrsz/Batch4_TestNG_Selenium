package com.krafttechnologie.tests.day06_css;

import com.krafttechnologie.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Css_Index {
    public static void main(String[] args) throws InterruptedException {

//      eighth formula
//      cssSyntax:nth-of-type(IndexNumber)
//      NOTE: it works only if the elements are under the same parent


        WebDriver driver= WebDriverFactory.getDriver("safari");
        driver.get("https://www.krafttechexlab.com/login");
        Thread.sleep(2000);

//      get the email as a whole
        WebElement emailAsWhole= driver.findElement(By.cssSelector(".col-12:nth-of-type(1)"));
//      get the password as a whole
        WebElement passwordAsWhole= driver.findElement(By.cssSelector(".col-12:nth-of-type(2)"));

//      get the login as a whole
        WebElement loginAsWhole= driver.findElement(By.cssSelector(".col-12:nth-of-type(4)"));

        driver.quit();


    }
}
