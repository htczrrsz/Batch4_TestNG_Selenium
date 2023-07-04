package com.krafttechnologie.tests.day14_properties_singleton;

import com.krafttechnologie.tests.TestBase;
import com.krafttechnologie.utilities.ConfigurationReader;
import com.krafttechnologie.utilities.Driver;
import com.krafttechnologie.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class LoginTest extends TestBase {




    @Test
    public void positiveLoginTest() throws InterruptedException {
        driver.get(ConfigurationReader.get("url"));
        driver.findElement(By.id("email")).sendKeys(ConfigurationReader.get("userEmail"));
        driver.findElement(By.id("yourPassword")).sendKeys(ConfigurationReader.get("userPassword"));
        driver.findElement(By.xpath("//*[.='Login']")).click();
        Thread.sleep(3000);
    }



    @Test
    public void anotherLoginTest() {
        driver.get(ConfigurationReader.get("url"));
        WebElement userEmailInput=driver.findElement(By.id("email"));
        WebElement userPassword=driver.findElement(By.id("yourPassword"));
        userEmailInput.sendKeys(ConfigurationReader.get("userEmail"));
        userPassword.sendKeys(ConfigurationReader.get("userPassword")+ Keys.ENTER);
        // userPassword.sendKeys(ConfigurationReader.get("userPassword")+ Keys.TAB+Keys.TAB+Keys.TAB+Keys.ENTER);
    }


}
