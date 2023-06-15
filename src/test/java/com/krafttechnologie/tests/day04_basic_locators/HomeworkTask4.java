package com.krafttechnologie.tests.day04_basic_locators;

import com.krafttechnologie.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomeworkTask4 {
    public static void main(String[] args) throws InterruptedException {



        /**
         * HW TASK 4
         * open chrome browser
         * go to https://demoqa.com/login
         * click on login button
         * VERIFY that url is not changed
         */

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://demoqa.com/login");
        WebElement login = driver.findElement(By.id("login"));
        login.click();
        Thread.sleep(2000);
        String expectedUrl="https://demoqa.com/login";
        String actualUrl= driver.getCurrentUrl();
        if (expectedUrl.equals(actualUrl)){
            System.out.println("passed");
        }else {
            System.out.println("failed");
        }

driver.quit();

    }
}
