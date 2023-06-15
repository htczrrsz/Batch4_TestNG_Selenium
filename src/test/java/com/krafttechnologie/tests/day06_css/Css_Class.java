package com.krafttechnologie.tests.day06_css;

import com.krafttechnologie.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Css_Class {
    public static void main(String[] args) throws InterruptedException {

        //go to https://www.krafttechexlab.com/login

        //locate the loginToYourAccount title box with class attribute by using css syntax
        //get the text and display

        //locate the login button with class attribute by using css syntax
        //tap on the button and see the url is not changed

        WebDriver driver= WebDriverFactory.getDriver("safari");
        driver.get("https://www.krafttechexlab.com/login");
        Thread.sleep(2000);

//      class value al basina nokta koy ve aralarinda bosluk varsa bosluklari nokta ile kapat
        WebElement loginToYourAccount = driver.findElement(By.cssSelector(".card-title.text-center.pb-0.fs-4"));
        System.out.println("loginToYourAccount.getText() = " + loginToYourAccount.getText());

        Thread.sleep(2000);
        WebElement loginButton = driver.findElement(By.cssSelector(".btn.btn-primary.w-100"));
        loginButton.click();
        Thread.sleep(2000);



        driver.quit();


    }
}
