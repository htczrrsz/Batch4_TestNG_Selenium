package com.krafttechnologie.tests.day08_typeOfWebElements;

import com.krafttechnologie.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DisplayedDemo {


    @Test
    public void displayedDemo() throws InterruptedException {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
        Thread.sleep(2000);

        WebElement startButton= driver.findElement(By.cssSelector("#start>button"));
        WebElement hello= driver.findElement(By.xpath("//h4[text()='Hello World!']"));

        System.out.println("hello.isDisplayed() = " + hello.isDisplayed());
        System.out.println("hello.getText() = " + hello.getText());

        Thread.sleep(2000);
        Assert.assertFalse(hello.isDisplayed());

        startButton.click();
        Thread.sleep(5000);
        Assert.assertTrue(hello.isDisplayed());
        System.out.println("2 hello.getText() = " + hello.getText());

        driver.quit();
    }

    @Test
    public void displayedTest2() throws InterruptedException {
        /**  HOME TASK
         https://the-internet.herokuapp.com/dynamic_loading
         Example 2: Element rendered after the fact -->click
         click that element
         verify that hello world is not displayed
         click start button
         verify that hello element is displayed
         and verify that "Hello World!" text is present
         */
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://the-internet.herokuapp.com/dynamic_loading");
        Thread.sleep(2000);
        WebElement element2 = driver.findElement(By.xpath("//a[text()='Example 2: Element rendered after the fact']"));
        element2.click();



        WebElement hello1= driver.findElement(By.xpath("//div[@class='example']/div"));

//        System.out.println("hello1.isDisplayed() = " + hello1.isDisplayed());
        System.out.println("hello1.getText() = " + hello1.getText());
        String expected= "Hello World!";
        String actual= hello1.getText();
        Assert.assertFalse(expected.equals(actual));
        Thread.sleep(2000);


        WebElement startButton = driver.findElement(By.xpath("//div[@id='start']/button"));
        startButton.click();
        Thread.sleep(5000);
        WebElement hello=driver.findElement(By.xpath("//div[@id='finish']/h4"));
        System.out.println("hello.isDisplayed() = " + hello.isDisplayed());

        System.out.println("hello.getText() = " + hello.getText());

        driver.quit();


    }

}
