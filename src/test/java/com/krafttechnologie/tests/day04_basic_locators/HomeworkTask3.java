package com.krafttechnologie.tests.day04_basic_locators;

import com.krafttechnologie.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomeworkTask3 {
    public static void main(String[] args) throws InterruptedException {



        /**
         * HW TASK 3
         * open chrome browser
         * go to https://demoqa.com/login
         * enter "test" into the username box
         * enter "Test.!123" into the password box
         * tap on login button
         * VERIFY that url is changed as "https://demoqa.com/profile"
         */

        WebDriver driver= WebDriverFactory.getDriver("safari");
        driver.get("https://demoqa.com/login");

        WebElement userName = driver.findElement(By.id("userName"));
        userName.sendKeys("test");
        Thread.sleep(2000);
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("Test.!123");
        Thread.sleep(2000);
        WebElement login = driver.findElement(By.id("login"));
        login.click();
        Thread.sleep(2000);

        String expectedUrl="https://demoqa.com/profile";
        String actualUrl= driver.getCurrentUrl();
        System.out.println("expectedUrl = " + expectedUrl);
        System.out.println("actualUrl = " + actualUrl);
        if (actualUrl.equals(expectedUrl)){
            System.out.println("passed");
        }else{
            System.out.println("failed");
        }

        driver.quit();


    }
}
