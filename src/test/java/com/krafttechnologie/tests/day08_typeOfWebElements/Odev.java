package com.krafttechnologie.tests.day08_typeOfWebElements;

import com.krafttechnologie.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Odev {

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

}

