package com.krafttechnologie.tests.day04_basic_locators;

import com.github.javafaker.Faker;
import com.krafttechnologie.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IdLocatorTest {
    public static void main(String[] args) throws InterruptedException {

        Faker faker= new Faker();

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://demoqa.com/text-box");

        WebElement inputUserName = driver.findElement(By.id("userName"));
//        inputUserName.sendKeys("Jake Hide");
        inputUserName.sendKeys(faker.name().fullName());

        WebElement inputUserEmail = driver.findElement(By.id("userEmail"));
//        inputUserEmail.sendKeys("jake@hide.com");
        inputUserEmail.sendKeys(faker.internet().emailAddress());

        Thread.sleep(2000);
        WebElement inputCurrentAddress = driver.findElement(By.id("currentAddress"));

        driver.close();

    }
}
