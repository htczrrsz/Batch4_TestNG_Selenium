package com.krafttechnologie.tests.day12_action_JS_FileUpload;

import com.krafttechnologie.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class FileUpload {


    WebDriver driver;


    @BeforeMethod
    public void setUp() throws InterruptedException {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

    }


    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }

//    @Test
//    public void test1() {
//        driver.get("https://the-internet.herokuapp.com/upload");
//        WebElement chooseFile = driver.findElement(By.cssSelector("#file-upload"));
//
//        chooseFile.sendKeys("deneme2.txt");
//        //
//
//        driver.findElement(By.id("file-submit")).click();
//
//        String actualText = driver.findElement(By.id("uploaded-files")).getText();
//
//        Assert.assertEquals(actualText, "Selenium File Upload.txt");
//
//    }

        @Test
        public void fileUploadTestDemo () {

            System.out.println("System.getProperty(\"user.dir\") = " + System.getProperty("user.dir"));
            System.out.println("System.getProperty(\"os.name\") = " + System.getProperty("os.name"));

            driver.get("https://the-internet.herokuapp.com/upload");
            WebElement chooseFile = driver.findElement(By.cssSelector("#file-upload"));

            String projectPath = System.getProperty("user.dir");
            String filePath = "src/test/resources/file Upload.txt";
            System.out.println("filePath = " + filePath);
            String fullPath = projectPath + "/" + filePath;
            System.out.println("fullPath = " + fullPath);


        }


}


