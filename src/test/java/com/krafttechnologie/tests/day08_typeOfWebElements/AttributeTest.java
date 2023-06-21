package com.krafttechnologie.tests.day08_typeOfWebElements;

import com.krafttechnologie.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class AttributeTest {


    @Test
    public void attributeTest(){
        WebDriver driver= WebDriverFactory.getDriver("safari");
        driver.get("https://demoqa.com/text-box");
        WebElement userInputBox= driver.findElement(By.cssSelector("#userName"));
        System.out.println("userInputBox.getAttribute(\"id\") = " + userInputBox.getAttribute("id"));
        System.out.println("userInputBox.getAttribute(\"autocomplete\") = " + userInputBox.getAttribute("autocomplete"));
        System.out.println("userInputBox.getAttribute(\"outerHTML\") = " + userInputBox.getAttribute("outerHTML"));
        driver.quit();
    }
}
