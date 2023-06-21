package com.krafttechnologie.tests.day09_findElement_dropdowns;

import com.krafttechnologie.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.List;

public class ExerciseBySelf {
    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://www.krafttechexlab.com/forms/select");
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

    @Test
    public void deneme1(){
         WebElement selectMenu= driver.findElement(By.cssSelector("[aria-label='Default select example']"));
        Select select= new Select(selectMenu);

        List<WebElement> optionsOfSelectMenu = select.getOptions();
        System.out.println("optionsOfSelectMenu.size() = " + optionsOfSelectMenu.size());
        System.out.println("select.getFirstSelectedOption().getText() = " + select.getFirstSelectedOption().getText());
        Assert.assertTrue(optionsOfSelectMenu.size()==4);
    }



    @Test
    public void deneme2(){
        WebElement selectMenu = driver.findElement(By.cssSelector("[aria-label='Default select example']"));
        Select select= new Select(selectMenu);

        select.selectByVisibleText("Two");

        WebElement firstSelectedOption = select.getFirstSelectedOption();
//        System.out.println("firstSelectedOption.getText() = " + firstSelectedOption.getText());

        String actualSelected=firstSelectedOption.getText();
        String expectedSelected="Two";
        Assert.assertEquals(actualSelected,expectedSelected);


    }

}
