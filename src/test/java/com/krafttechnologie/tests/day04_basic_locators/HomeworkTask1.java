package com.krafttechnologie.tests.day04_basic_locators;

import com.github.javafaker.Faker;
import com.krafttechnologie.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomeworkTask1 {
    public static void main(String[] args) throws InterruptedException {

/** Class Task- Home work
 *  go to the url -  "https://www.browserstack.com/users/sign_up"
 *  maximize the window
 *  accept cookies if any ,
 *  fill in the blanks with the faker class
 *  click "Term of service" checkbox
 *  and close the window
 *
 *  hint: u can use any locator you want
 *
 */
        Faker faker= new Faker();

        WebDriver driver= WebDriverFactory.getDriver("safari");
        driver.get("https://www.browserstack.com/users/sign_up");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.id("accept-cookie-notification")).click();
        Thread.sleep(2000);

        WebElement userFullName = driver.findElement(By.id("user_full_name"));
        userFullName.sendKeys(faker.name().fullName());
        Thread.sleep(2000);
        WebElement userEmailLogin = driver.findElement(By.id("user_email_login"));
        userEmailLogin.sendKeys(faker.internet().emailAddress());
        Thread.sleep(2000);
        WebElement userPassword = driver.findElement(By.id("user_password"));
        userPassword.sendKeys(faker.internet().password());
        Thread.sleep(1000);
        driver.findElement(By.id("tnc_checkbox")).click();




        driver.quit();



    }
}
