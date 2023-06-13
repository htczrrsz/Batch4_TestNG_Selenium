package com.krafttechnologie.tests.day04_basic_locators;

import com.krafttechnologie.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ClassNameTest {
    public static void main(String[] args) {

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://www.krafttechexlab.com/index");
        System.out.println("driver.findElement(By.className(\"pagetitle\")).getText() = " + driver.findElement(By.className("pagetitle")).getText());
        System.out.println("driver.findElement(By.className(\"footer\")).getText() = " + driver.findElement(By.className("footer")).getText());
        // class ' i css ile aratirken . ile bakiyoruz. ( # yerine . )

        driver.close();

    }
}
