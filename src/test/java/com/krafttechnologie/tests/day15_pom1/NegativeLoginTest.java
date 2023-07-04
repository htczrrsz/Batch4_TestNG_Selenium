package com.krafttechnologie.tests.day15_pom1;

import com.krafttechnologie.pages.LoginPage;
import com.krafttechnologie.tests.TestBase;
import com.krafttechnologie.utilities.ConfigurationReader;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NegativeLoginTest extends TestBase {

    /**
        go to kraft login page
        provide right username
        provide wrong password
        top on login button
        validate that "Password is incorrect. Please check" message appears
     */



    @Test
    public void wrongPasswordTest() throws InterruptedException {
        LoginPage loginPage=new LoginPage();

      driver.get(ConfigurationReader.get("url"));
//      prove right username
      loginPage.emailInputBox.sendKeys(ConfigurationReader.get("userEmail"));
//      enter wrong password
      loginPage.passwordInputBox.sendKeys("wrong password");
//      click login button
      loginPage.loginButton.click();

//      verification
      String expected="Password is incorrect. Please check";
      String actual= loginPage.wrongPasswordAlert.getText();

      Assert.assertEquals(expected,actual);
//        Thread.sleep(2000);

    }


    @Test
    public void wrongUserNameTest(){

        /**
         * go to kraft page
         * provide wrong email
         * provide right password
         * click to login button
         * validate that "Email address is incorrect. Please check"  message appears
         */

        driver.get(ConfigurationReader.get("url"));
        LoginPage loginPage= new LoginPage();
        loginPage.emailInputBox.sendKeys("wrong email");
        loginPage.passwordInputBox.sendKeys(ConfigurationReader.get("userPassword"));
        loginPage.loginButton.click();
        String expected= "Email address is incorrect. Please check";
        String actual=loginPage.wrongEmailAlert.getText();
        Assert.assertEquals(expected,actual);

    }


    @Test
    public void listOfWebElement(){
        /**
         * go to kraft login
         login with Mike
         Verify that uptitles are following
         Dashboard
         Developers
         Components
         Forms
         JavaScript
         mike
         */



        driver.get(ConfigurationReader.get("url"));
        LoginPage loginPage= new LoginPage();
        loginPage.emailInputBox.sendKeys(ConfigurationReader.get("userEmail"));
        loginPage.passwordInputBox.sendKeys(ConfigurationReader.get("userPassword"));
        loginPage.loginButton.click();

        List<WebElement> upTitles = loginPage.upTitles;

        List <String> actualList= new ArrayList<>();

        for (WebElement upTitle : upTitles) {
            actualList.add(upTitle.getText());
        }

        List <String> expectedList= new ArrayList<>(
                Arrays.asList("Dashboard","Developers","Components","Forms","JavaScript","miamia"));
//        expectedList.add("Dashboard");
//        expectedList.add("Developers");


        Assert.assertEquals(actualList,expectedList);

    }




}
