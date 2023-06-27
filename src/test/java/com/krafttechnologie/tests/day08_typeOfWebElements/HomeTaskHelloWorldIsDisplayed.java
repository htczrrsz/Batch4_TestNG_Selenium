package com.krafttechnologie.tests.day08_typeOfWebElements;

import com.krafttechnologie.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomeTaskHelloWorldIsDisplayed {

     @Test
    public void odev() {

WebDriver driver= WebDriverFactory.getDriver("chrome");

        // Sayfaya git
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");

        // "click" linkine tıkla
//        WebElement clickLink = driver.findElement(By.xpath("//a[contains(text(),'click')]"));
//        clickLink.click();

        // "Hello World" metninin görünmediğini doğrula
        WebElement helloWorldElement = driver.findElement(By.xpath("//div[@id='finish']/h4"));
        boolean isHelloWorldDisplayed = helloWorldElement.isDisplayed();
        System.out.println("Hello World görünür mü?: " + isHelloWorldDisplayed);

        // "Start" düğmesine tıkla
        WebElement startButton = driver.findElement(By.cssSelector("#start > button"));
        startButton.click();

//        // "Hello" öğesinin görüntülendiğini doğrula
//        WebElement helloElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#finish > h4")));
//        boolean isHelloDisplayed = helloElement.isDisplayed();
//        System.out.println("Hello görünür mü?: " + isHelloDisplayed);

        // "Hello World!" metninin bulunduğunu doğrula
        WebElement helloWorldText = driver.findElement(By.cssSelector("#finish > h4"));
        String helloWorldTextValue = helloWorldText.getText();
        boolean isHelloWorldTextPresent = helloWorldTextValue.contains("Hello World!");
        System.out.println("Hello World! metni mevcut mu?: " + isHelloWorldTextPresent);

        driver.quit();
    }


    @Test
    public void cozum() throws InterruptedException {
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
         driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");
         Thread.sleep(2000);
         String hello="Hello World!";

        WebElement body = driver.findElement(By.tagName("body"));
        System.out.println("body.getText() = " + body.getText());

        Assert.assertFalse(body.getText().contains(hello));
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#start>button")).click();
        Thread.sleep(6000);
        System.out.println("body.getText() = " + body.getText());
        Assert.assertTrue(body.getText().contains(hello));

        WebElement helloWorld = driver.findElement(By.xpath("//h4[text()='Hello World!']"));
        Assert.assertTrue(helloWorld.isDisplayed());

        driver.quit();
    }
}

