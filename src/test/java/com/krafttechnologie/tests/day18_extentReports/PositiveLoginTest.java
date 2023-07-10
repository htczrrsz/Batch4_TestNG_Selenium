package com.krafttechnologie.tests.day18_extentReports;

import com.krafttechnologie.pages.LoginPage;
import com.krafttechnologie.tests.TestBase;
import com.krafttechnologie.utilities.ConfigurationReader;
import org.testng.annotations.Test;

public class PositiveLoginTest extends TestBase {

    @Test
    public  void loginTest(){
        LoginPage loginPage= new LoginPage();
        extentLogger= report.createTest("Login Test");

        extentLogger.info("Go to Krafttech Login Page");
        driver.get(ConfigurationReader.get("url"));
        extentLogger.info("Login method");
        loginPage.login();
        System.out.println("1");
    }

    @Test
    public  void loginTest2(){
        LoginPage loginPage= new LoginPage();
        extentLogger= report.createTest("Login Test 2");

        extentLogger.info("Go to Krafttech Login Page");
//        driver.get(ConfigurationReader.get("url"));
        extentLogger.info("Login method 2");
        loginPage.login();
        System.out.println("2");
    }


}
