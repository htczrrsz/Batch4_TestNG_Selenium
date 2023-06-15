package com.krafttechnologie.tests.day04_basic_locators;

import com.krafttechnologie.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomeworkTask5 {
    public static void main(String[] args) throws InterruptedException {


        /**
         * Hw TASK 5
         * open chrome browser
         * go to https://demoqa.com/login
         * enter "test" into the username box
         * VERIFY that "test" is displayed in the username box
         * enter "Test.!123" into the password box
         * tap on login button
         * VERIFY that username is still "test"
         */


        WebDriver driver= WebDriverFactory.getDriver("safari");
        driver.get("https://demoqa.com/login");
        Thread.sleep(2000);
        WebElement userName = driver.findElement(By.id("userName"));
        userName.sendKeys("test");
        Thread.sleep(1000);
        String usernameValue = userName.getAttribute("value");
        System.out.println("usernameValue = " + usernameValue);
        Thread.sleep(2000);

        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("Test.!123");
        Thread.sleep(2000);
        String passwordValue = password.getAttribute("value");
        System.out.println("passwordValue = " + passwordValue);
        Thread.sleep(2000);

        WebElement login = driver.findElement(By.id("login"));
        login.click();
        Thread.sleep(2000);

        String actualUsernameValue = driver.findElement(By.id("userName-value")).getText();
        String expectedUsername="test";

        System.out.println("actualUsernameValue = " + actualUsernameValue);

        if (actualUsernameValue.equals(expectedUsername)){
            System.out.println("passed");
        }else{
            System.out.println("failed");
        }


        driver.quit();

    }
}
