package com.krafttechnologie.tests.day05_xpath;

import com.krafttechnologie.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RelativeXpath1 {

    public static void main(String[] args) throws InterruptedException {


        //go to amazon.com
        //locate search bar with xpath
        //locate search button with xpath

        WebDriver driver= WebDriverFactory.getDriver("safari");
        driver.get("https://www.amazon.com/");
        Thread.sleep(1000);

        // find the element by known attribute-value
        WebElement searchBar= driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        Thread.sleep(1000);
        // find the element by known attribute-value
        WebElement searchButton= driver.findElement(By.xpath("//input[@value='Go']"));
        searchBar.sendKeys("selenium");
        Thread.sleep(2000);
        searchButton.click();

        Thread.sleep(1000);
        WebElement textSeleniumElement= driver.findElement(By.xpath("//span[.='\"selenium\"']"));
        Thread.sleep(1000);
        System.out.println("textSeleniumElement.getText() = " + textSeleniumElement.getText());


        driver.quit();




    }
}
