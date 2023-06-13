package com.krafttechnologie.tests.day04_basic_locators;

import com.krafttechnologie.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NameLocatorTest {
    public static void main(String[] args) throws InterruptedException {


        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.krafttechexlab.com/login");
        driver.findElement(By.name("email")).sendKeys("miamia");
        Thread.sleep(1000);
        driver.findElement(By.name("password")).sendKeys("123456789Mia");
        Thread.sleep(2000);

        driver.close();



    }
}
