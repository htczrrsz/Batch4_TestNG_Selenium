package com.krafttechnologie.tests.day05_xpath;

import com.krafttechnologie.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RelativeXpath2 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver= WebDriverFactory.getDriver("safari");
        driver.get(" https://www.krafttechexlab.com/forms/input\n");
Thread.sleep(2000);
        // locate the webelement with starts-with(attribute,'value')
        WebElement password= driver.findElement(By.xpath("//label[starts-with(@for,'inputP')]"));
        System.out.println("password.getText() = " + password.getText());

       WebElement password1= driver.findElement(By.xpath("//label[starts-with(text(),'P')]"));
        System.out.println("password1.getText() = " + password1.getText());
        driver.quit();

    }
}
