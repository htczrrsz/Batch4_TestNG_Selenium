package com.krafttechnologie.tests.day13_webtables;

import com.krafttechnologie.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Exercise {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);


    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }


    @Test
    public void exercise(){
        driver.get("https://demoqa.com/webtables");

        List<WebElement> elements = driver.findElements(By.xpath("//div[@class='rt-tr-group']"));
        System.out.println("elements.size() = " + elements.size());
//        for (WebElement element : elements) {
//            System.out.println(element.getText());
//        }
        System.out.println("elements.get(1).getText() = " + elements.get(1).getText());


    }


}
