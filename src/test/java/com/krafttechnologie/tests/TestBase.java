package com.krafttechnologie.tests;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.krafttechnologie.utilities.BrowserUtils;
import com.krafttechnologie.utilities.ConfigurationReader;
import com.krafttechnologie.utilities.Driver;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class TestBase {

    protected WebDriver driver;
    protected Actions actions;
    protected WebDriverWait wait;

    //     this class is used for starting and building reports
    protected ExtentReports report;

    //     this class is used to create html report file
    protected ExtentHtmlReporter htmlReporter;

    //     this will define a test, enable adding logs, authors and test steps
    protected ExtentTest extentLogger;

    @BeforeTest
    public void setUpTest(){
//         initialize the class
        report=new ExtentReports();
//         create a report path
        String projectPath=System.getProperty("user.dir");


    /**   to take dynamic report
        String date = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
        String path=projectPath+"/test-output/report"+date+".html";
        */


        String path=projectPath+"/test-output/report.html";

//         initialize the html report with the report path
        htmlReporter=new ExtentHtmlReporter(path);

//         attach the html report to the report object
        report.attachReporter(htmlReporter);

//         title in report
        htmlReporter.config().setReportName("KraftTech smoke test");

//        set environment information
        report.setSystemInfo("Environment","Production");
        report.setSystemInfo("Browser", ConfigurationReader.get("browser"));
        report.setSystemInfo("OS",System.getProperty("os.name"));
        report.setSystemInfo("Test Engineer","HZ");

    }


    @AfterTest
    public void tearDownTest(){
            report.flush();  // this is when the report is actuallt created
        }



    @BeforeMethod
    public void setUp() throws InterruptedException {
        driver = Driver.get();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        actions = new Actions(driver);
        wait = new WebDriverWait(driver, 10);
//        driver.get(ConfigurationReader.get("url"));
    }


    @AfterMethod
    public void tearDown(ITestResult result) throws InterruptedException, IOException {
//        if test fail
        if (result.getStatus() == ITestResult.FAILURE) {
            // Record the name of the failed test
            extentLogger.fail(result.getName());
//            Take the screenshot and return the location of screenshot
            String screenshotPath = BrowserUtils.getScreenshot(result.getName());
            // add the screenshot to the report
            extentLogger.addScreenCaptureFromPath(screenshotPath);
//            capture the exception and put inside the report
            extentLogger.fail(result.getThrowable());

//            var camera = (TakesScreenshot) driver;
//            File screenshot = camera.getScreenshotAs(OutputType.FILE);
//            try {
//                Files.move(screenshot.toPath(),
//                        new File("test-output/Screenshots"+result.getName()+".png").toPath());
//            } catch (IOException e) {
//                e.printStackTrace();
//            }


        }
        Thread.sleep(2000);
        Driver.closeDriver();
//    }

    }
}
