package com.krafttechnologie.tests.day08_typeOfWebElements;

import com.krafttechnologie.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DisabledElement {


    /**    What is disabled element ?
     * U can NOT interact with this element
     * U can NOT click
     * or U can NOT write something
     */

    @Test
    public void disabledElement() throws InterruptedException {
        WebDriver driver= WebDriverFactory.getDriver("safari");
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");
        WebElement disabledElement = driver.findElement(By.cssSelector("#input-example>input"));
        Assert.assertFalse(disabledElement.isEnabled(),"verify that element is NOT enable or element is disable");

//        if we click the enable button it will be interactive
        WebElement enableDisableButton= driver.findElement(By.cssSelector("#input-example>button"));

        enableDisableButton.click();
        Thread.sleep(5000);
        Assert.assertTrue(disabledElement.isEnabled());

        driver.quit();
    }



}
