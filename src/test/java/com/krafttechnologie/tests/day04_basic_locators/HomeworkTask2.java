package com.krafttechnologie.tests.day04_basic_locators;

import com.krafttechnologie.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomeworkTask2 {
    public static void main(String[] args) throws InterruptedException {


/** Class Task
 *  go to the amazon webpage
 *  write "selenium" to search box
 *  verify that the result of the search
 */

        WebDriver driver= WebDriverFactory.getDriver("safari");
        driver.get("https://www.amazon.com/");
        WebElement searchTextBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchTextBox.sendKeys("selenium");
        WebElement searchButton = driver.findElement(By.id("nav-search-submit-button"));
        searchButton.click();
        Thread.sleep(2000);
        WebElement resultWord = driver.findElement(By.xpath("//span[@class='a-color-state a-text-bold']"));
        System.out.println("resultWord.getText() = " + resultWord.getText());
        Thread.sleep(1000);

        driver.quit();


    }
}
