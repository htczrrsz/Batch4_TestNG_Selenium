package com.krafttechnologie.tests.day10_alerts_multipleWindows_iframe;

import com.krafttechnologie.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HtmlPopUps {



    @Test
    public void htmlPopUpTest() throws InterruptedException {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://primefaces.org/showcase/ui/overlay/confirmDialog.xhtml?jfwid=e6cd5");
        Thread.sleep(2000);

        WebElement confirmButton = driver.findElement(By.xpath("(//span[text()='Confirm'])[1]"));
        confirmButton.click();
        Thread.sleep(2000);
        WebElement yesButton = driver.findElement(By.xpath("//span[.='Yes']"));
        yesButton.click();
        Thread.sleep(2000);

        WebElement confirmationPopUp = driver.findElement(By.xpath("//p[.='You have accepted']"));

        String actual=confirmationPopUp.getText();
        String expected="You have accepted";
        Assert.assertEquals(actual,expected);

        driver.quit();

    }



}
