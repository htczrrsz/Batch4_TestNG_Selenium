package com.krafttechnologie.tests.day04_basic_locators;

import com.krafttechnologie.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TagNameLocator {
    public static void main(String[] args) throws InterruptedException {


        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.krafttechexlab.com/login");
        driver.findElement(By.name("email")).sendKeys("mia@gmail.com");
        Thread.sleep(1000);
        driver.findElement(By.name("password")).sendKeys("123456789Mia");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("[type='submit']")).click();
        Thread.sleep(1000);


        System.out.println("driver.findElement(By.tagName(\"//h2\")).getText() = " + driver.findElement(By.tagName("h2")).getText());
//        mike
        System.out.println("driver.findElement(By.tagName(\"//h3\")).getText() = " + driver.findElement(By.tagName("h3")).getText());
//        bos

        driver.close();


    }
}
