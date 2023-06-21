package com.krafttechnologie.tests.day08_typeOfWebElements;

import com.krafttechnologie.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RadioButtonTest {

    @Test
    public void radioButtonIsSelected() throws InterruptedException {
        WebDriver driver= WebDriverFactory.getDriver("safari");
        driver.get("https://demo.aspnetawesome.com/");
        Thread.sleep(2000);
        WebElement vegetablesRadio = driver.findElement(By.xpath("//div[text()='Vegetables']/../input"));
        Thread.sleep(2000);
        System.out.println("vegetablesRadio.isSelected() = " + vegetablesRadio.isSelected());

        Assert.assertTrue(vegetablesRadio.isSelected(),"verify that \"vegetables\" radio is selected");
        Thread.sleep(2000);

        /**
         * verify that legumes is NOT selected
         * click legumes
         * verify that legumes selected
         * verify that vegetables is NOT selected
         */

        WebElement legumesRadio = driver.findElement(By.xpath("//div[text()='Legumes']/../input"));
        Thread.sleep(2000);
        Assert.assertFalse(legumesRadio.isSelected(),"verify that legumes radio is not selected");

//        System.out.println("legumesRadio.isSelected() = " + legumesRadio.isSelected());
        WebElement legumesClick = driver.findElement(By.xpath("//div[text()='Legumes']/../div[1]"));
        legumesClick.click();
        Assert.assertTrue(legumesRadio.isSelected(),"verify that \"legumes\" radio is selected");

        Thread.sleep(2000);

        Assert.assertFalse(vegetablesRadio.isSelected());


        driver.quit();
    }



    @Test
    public void checkBoxIsSelected() throws InterruptedException {
        WebDriver driver= WebDriverFactory.getDriver("safari");
        driver.get("https://the-internet.herokuapp.com/checkboxes");
        Thread.sleep(2000);
        WebElement checkBox1= driver.findElement(By.xpath("//form[@id='checkboxes']/input[1]"));
        WebElement checkBox2= driver.findElement(By.xpath("//form[@id='checkboxes']/input[2]"));

        Assert.assertTrue(checkBox2.isSelected());
        Thread.sleep(2000);
        Assert.assertFalse(checkBox1.isSelected());


        checkBox1.click();
        Thread.sleep(2000);
        checkBox2.click();
        Thread.sleep(2000);

        Assert.assertTrue(checkBox1.isSelected());
        Assert.assertFalse(checkBox2.isSelected());

        driver.quit();
    }



}
