package com.krafttechnologie.tests.day10_alerts_multipleWindows_iframe;

import com.krafttechnologie.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import javax.swing.*;

public class JSPopUps {

    WebDriver driver;

    @BeforeMethod
    public void setUp() throws InterruptedException {
        driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.manage().window().maximize();
        Thread.sleep(2000);
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }


    @Test
    public void jsPopUp_Accept() throws InterruptedException {
//      tap on click for JS alert button
        WebElement clickForJSAlert = driver.findElement(By.xpath("//button[text()='Click for JS Alert']"));
        clickForJSAlert.click();
        Thread.sleep(2000);

//      create alert object
        Alert alert= driver.switchTo().alert();
//      tap on OK button
        alert.accept();

//      verification
        WebElement resultText = driver.findElement(By.cssSelector("#result"));
        String actual = resultText.getText();
        String expected="You successfully clicked an alert";
        Assert.assertEquals(actual,expected);
    }


    @Test
    public void jsPopUp_Dismiss() throws InterruptedException {
//      tap on click for JsConfirm
        WebElement clickForJsConfirm= driver.findElement(By.xpath("//button[text()='Click for JS Confirm']"));
        clickForJsConfirm.click();
        Thread.sleep(2000);

//      create an alert objects
        Alert alert= driver.switchTo().alert();
        alert.dismiss();

//      verification
        String actual= driver.findElement(By.cssSelector("#result")).getText();
        String expected="You clicked: Cancel";
        Assert.assertEquals(actual,expected);

    }


    @Test
    public void jsPopUp_SendKeys() throws InterruptedException {
        WebElement clickForJSPrompt = driver.findElement(By.xpath("//button[text()='Click for JS Prompt']"));
        clickForJSPrompt.click();
Thread.sleep(2000);
        Alert alert= driver.switchTo().alert();

        String text="alperen";
        alert.sendKeys(text);
        Thread.sleep(3000);
        alert.accept();

        String actual= driver.findElement(By.cssSelector("#result")).getText();
        String expected="You entered: "+ text ;

        Assert.assertEquals(actual,expected);

    }

}
