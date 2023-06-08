package com.krafttechnologie.tests.day03_webelement_intro;

import com.krafttechnologie.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GetAttribute {
    public static void main(String[] args) {

        String email="mike@gmail.com";


        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.krafttechexlab.com/login");

        WebElement emailInputBox= driver.findElement(By.id("email"));
        // getAttribute --> give me attribute I will give you value
        String value= emailInputBox.getAttribute("class");
        System.out.println("value = " + value);


    }
}
