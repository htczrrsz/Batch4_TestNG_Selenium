package com.krafttechnologie.tests.day03_webelement_intro;

import com.krafttechnologie.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Exercise_demoqa {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://demoqa.com/login");

        WebElement userName = driver.findElement(By.id("userName"));
        userName.sendKeys("Hatice");
        Thread.sleep(2000);
        System.out.println("userName.getAttribute(\"value\") = " + userName.getAttribute("value"));

        Thread.sleep(1000);

        driver.findElement(By.id("password")).sendKeys("1234");
        Thread.sleep(2000);

        driver.findElement(By.id("login")).click();

        driver.quit();



    }
}
