package com.krafttechnologie.tests.day04_basic_locators;

import com.krafttechnologie.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LinkTextAndPartialLinkText {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://the-internet.herokuapp.com/dynamic_loading");

        WebElement example1 = driver.findElement(By.linkText("Example 1: Element on page that is hidden"));
        example1.click();
        Thread.sleep(1000);

        String actualTexth3=driver.findElement(By.tagName("h3")).getText();
        String expectedTexth3= "Dynamically Loaded Page Elements";

        if (expectedTexth3.equals(actualTexth3)){
            System.out.println("passed");
        }else {
            System.out.println("failed");
        }

        Thread.sleep(2000);
        driver.navigate().back();

        driver.findElement(By.partialLinkText("fact")).click();
        String actualText = driver.findElement(By.tagName("h4")).getText();
        String expectedText2="Example 2: Element rendered after the fact";
        if (actualText.equals(expectedText2)){
            System.out.println("passed");
        }else{
            System.out.println("failed");
        }
        Thread.sleep(2000);

        driver.close();


    }
}
