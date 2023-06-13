package com.krafttechnologie.tests.day05_xpath;

import com.krafttechnologie.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RelativeXpath4 {
    public static void main(String[] args) throws InterruptedException {

        //go to "https://www.krafttechexlab.com/components/modal"

        // AND LOGIC

        WebDriver driver= WebDriverFactory.getDriver("safari");
        driver.get("https://www.krafttechexlab.com/components/modal");
        Thread.sleep(2000);

        WebElement basicModal= driver.findElement(By.xpath("//button[@type='button'][@data-bs-target='#basicModal']"));
        System.out.println("basicModal.getText() = " + basicModal.getText());

//        get the webelement by using AND logic with Xpath
        WebElement basicModal1= driver.findElement(By.xpath("//button[@type='button' and @data-bs-target='#basicModal']"));
        System.out.println("basicModal1.getText() = " + basicModal1.getText());

        // OR LOGIC
        // go to

        driver.get("https://www.krafttechexlab.com/components/tabs");
        WebElement messagesElement= driver.findElement(By.xpath("//button[@data-bs-target='#v-pills-messages' or @id='v-pills-messages-tab']"));
        System.out.println("messagesElement.getText() = " + messagesElement.getText());

        Thread.sleep(2000);


        driver.quit();



    }
}
