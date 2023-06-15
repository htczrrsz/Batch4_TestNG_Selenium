package com.krafttechnologie.tests.day06_css;

import com.krafttechnologie.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Css_ParentToChild {
    public static void main(String[] args) throws InterruptedException {


//        xpath    -->      '/'   --> parent to child

//        css      -->      '>'   --> parent to child

//        xpath    -->      '//'  --> parent to grandson

//        css      -->      ' '   --> parent to grandson


        WebDriver driver= WebDriverFactory.getDriver("safari");
        driver.get("https://www.krafttechexlab.com/login");
        Thread.sleep(2000);

//      parent to child
        WebElement email= driver.findElement(By.cssSelector(".col-12:nth-of-type(1)>label"));
        System.out.println("email.getText() = " + email.getText());

//      locate to login webElement using parentToGrandson by css locator
//      parent to grandson
        WebElement login = driver.findElement(By.cssSelector(".row.g-3.needs-validation button"));
        System.out.println("login.getText() = " + login.getText());


        driver.quit();



    }
}
