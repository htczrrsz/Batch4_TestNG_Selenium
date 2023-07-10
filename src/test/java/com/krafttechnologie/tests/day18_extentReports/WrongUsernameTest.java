package com.krafttechnologie.tests.day18_extentReports;

import com.krafttechnologie.pages.LoginPage;
import com.krafttechnologie.tests.TestBase;
import com.krafttechnologie.utilities.ConfigurationReader;
import org.apache.commons.logging.Log;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WrongUsernameTest extends TestBase {

    @Test
    public void wrongUserEmail() {
        LoginPage loginPage= new LoginPage();

        extentLogger=report.createTest("Wrong User Email Test");

        extentLogger.info("Go to Krafttech Login Page");
        driver.get(ConfigurationReader.get("url"));
        extentLogger.info("Enter wrong user email");
        loginPage.emailInputBox.sendKeys("mia@gmail.co");
        extentLogger.info("Enter user password");
        loginPage.passwordInputBox.sendKeys(ConfigurationReader.get("userPassword"));
        extentLogger.info("Click login button");
        loginPage.loginButton.click();
        String actualMessage=loginPage.wrongEmailAlert.getText();
        String expectedMessage=" address is incorrect. Please check";
        Assert.assertEquals(actualMessage,expectedMessage);
        extentLogger.info("Verify that not login");
        extentLogger.pass("PASSED");



    }


    @Test
    public void wrongPasswordTest(){
        LoginPage loginPage= new LoginPage();

        extentLogger=report.createTest("Wrong Password Test");

        extentLogger.info("Go to Krafttech Login Page");
        driver.get(ConfigurationReader.get("url"));
        extentLogger.info("Enter valid user email");
        loginPage.emailInputBox.sendKeys(ConfigurationReader.get("userEmail"));
        extentLogger.info("Enter wrong password");
        loginPage.passwordInputBox.sendKeys("gaasff");
        extentLogger.info("Click login button");
        loginPage.loginButton.click();
        String actualMessage=loginPage.wrongPasswordAlert.getText();
        extentLogger.info("Verify that not login");
        String expectedMessage="  is incorrect. Please check";
//        String expectedMessage="Password is incorrect. Please check";
        Assert.assertEquals(actualMessage,expectedMessage);

        extentLogger.pass("PASSED");


    }


}
