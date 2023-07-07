package com.krafttechnologie.tests.day17_pom3;

import com.krafttechnologie.pages.*;
import com.krafttechnologie.tests.TestBase;
import com.krafttechnologie.utilities.BrowserUtils;
import com.krafttechnologie.utilities.ConfigurationReader;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EditProfileTest extends TestBase {
    /** Class Task
     *  THIS TASK WILL BE IMPLEMENTED USING POM
     *  which means we will have one test class for the test
     *  and one corresponding page having all locators and actions for the page
     *  go to https;//www.krafttechexlab.com/login
     *  enter valid credentials
     *           --> miamia@gmail.com
     *           --> Mia123456
     *  go to miamia  --> my profile
     *  create a method that navigate you to specific module based on the given parameter
     *  go to Edit Profile page using the method just mentioned above
     *  fill out the fields
     *   ---> About -->     SDET program, graduate from KraftTech
     *   ---> Company -->   Amazon
     *   ---> Job -->       QA Automation Engineer
     *   ---> Website -->   www.amazon.com
     *   ---> Location -->  London
     *   ---> Skills -->    Java, Selenium, TestNG
     *   click save changes button
     *   verify that "profile updated" appears

     */


    @Test
    public void editProfileTest(){
        LoginPage loginPage= new LoginPage();
        DashboardPage dashboardPage= new DashboardPage();
        UserProfilePage userProfilePage= new UserProfilePage();
        EditProfilePage editProfilePage= new EditProfilePage();

        driver.get(ConfigurationReader.get("url"));
        loginPage.login();

        BrowserUtils.waitForVisibility(dashboardPage.userAccountName,5);
        dashboardPage.navigateToModule("miamia","My Profile");

        dashboardPage.navigateToModule("miamia","My Profile");
        userProfilePage.navigateToOverviewMenu("Edit Profile");

        editProfilePage.aboutInputBox.clear();
        editProfilePage.aboutInputBox.sendKeys("SDET program, graduate from KraftTech");

        editProfilePage.companyInputBox.clear();
        editProfilePage.companyInputBox.sendKeys("Amazon");

        /**Select select= new Select(editProfilePage.jobInputBox);
        select.selectByVisibleText("QA Automation Engineer");
         */
        editProfilePage.selectJob("QA Automation Engineer");

        editProfilePage.websiteInputBox.clear();
        editProfilePage.websiteInputBox.sendKeys("www.amazon.com");

        editProfilePage.locationInputBox.clear();
        editProfilePage.locationInputBox.sendKeys("London");

        editProfilePage.skillsInputBox.clear();
        editProfilePage.skillsInputBox.sendKeys("Java, Selenium, TestNG");

        editProfilePage.saveChangesButton.click();

        String expectedMessage="Profile Updated";
        String actualMessage=userProfilePage.profileUpdateMessage.getText();
//        String actualMessage2=userProfilePage.updateMessageGetText();

        Assert.assertEquals(expectedMessage,actualMessage);



    }


}
