package com.krafttechnologie.tests.day06_css;

import com.krafttechnologie.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Css_MultipleAttributeValue {
    public static void main(String[] args) throws InterruptedException {

//  THERE IS NOT OR LOGIC WITH CSS
//  THERE IS ONLY AND LOGIC

        //go to https://www.krafttechexlab.com/forms/input

        //locate the Read Only/Disabled web element with multiple attribute-value by using css syntax
        //get the text and display

        // Seventh Formula
        // [attribute1='value1'][attribute2='value2']
        // tagname[attribute1='value1'][attribute2='value2']

        WebDriver driver= WebDriverFactory.getDriver("safari");
        driver.get("https://www.krafttechexlab.com/forms/input");
        Thread.sleep(2000);

        WebElement readOnlyDisabled= driver.findElement(By.cssSelector("input[type='text'][value='Read only / Disabled']"));
        System.out.println("readOnlyDisabled.getAttribute(\"value\") = " + readOnlyDisabled.getAttribute("value"));

        WebElement readOnlyDisabled1= driver.findElement(By.cssSelector("[type='text'][value='Read only / Disabled']"));
        System.out.println("readOnlyDisabled1.getAttribute(\"value\") = " + readOnlyDisabled1.getAttribute("value"));
        driver.quit();


    }
}
