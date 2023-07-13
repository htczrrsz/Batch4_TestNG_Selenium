package com.krafttechnologie.tests.day20_ddf;

import com.krafttechnologie.pages.LoginPage;
import com.krafttechnologie.tests.TestBase;
import com.krafttechnologie.utilities.ConfigurationReader;
import com.krafttechnologie.utilities.ExcelUtil;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Arrays;

public class DataProvider_LoginTest extends TestBase {

    @DataProvider
    public Object[][] userData(){
        ExcelUtil excelUtil= new ExcelUtil("src/test/resources/Book1.xlsx","Sheet2");
        String[][] dataArrayWithoutFirstRow = excelUtil.getDataArrayWithoutFirstRow();
        return dataArrayWithoutFirstRow;
    }


    @Test(dataProvider = "userData")
    public void loginTestWithDataProvider(String username, String password, String name){
        driver.get(ConfigurationReader.get("url"));   // go to url
        LoginPage loginPage= new LoginPage();         // create an object from loginPage

        loginPage.emailInputBox.sendKeys(username);
        loginPage.passwordInputBox.sendKeys(password);
        loginPage.loginButton.click();


        String expected=name;
        String actual=loginPage.getUserAccountName();
        Assert.assertEquals(expected,actual);

    }



}
