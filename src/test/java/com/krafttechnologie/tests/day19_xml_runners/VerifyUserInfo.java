package com.krafttechnologie.tests.day19_xml_runners;

import com.krafttechnologie.pages.EditProfilePage;
import com.krafttechnologie.pages.LoginPage;
import com.krafttechnologie.pages.UserProfilePage;
import com.krafttechnologie.tests.TestBase;
import com.krafttechnologie.utilities.ConfigurationReader;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyUserInfo extends TestBase {

    /** Class Task
     Login as a mike
     Verify that login is successful by using url
     Click on My profile
     Click on Edit Profile
     Verify that job is QA Automation Engineer
     */


    @Test
    public void verifyTheJob(){
        LoginPage loginPage= new LoginPage();
        UserProfilePage userProfilePage= new UserProfilePage();
        EditProfilePage editProfilePage=new EditProfilePage();
        extentLogger=report.createTest("TC001 VerifyTheJob");

        extentLogger.info("Login as miamia");
        driver.get(ConfigurationReader.get("url"));
        loginPage.login();

       extentLogger.info("Verify that you are on the home page by using miamia");
       String expectedAccountName="miamia";
       String actualAccountName=loginPage.getUserAccountName();
       Assert.assertEquals(expectedAccountName,actualAccountName);

       extentLogger.info("Click on My Profile");
       loginPage.navigateToModule("miamia","My Profile");
       extentLogger.info("Click on Edit Profile");
       userProfilePage.navigateToOverviewMenu("Edit Profile");

       extentLogger.info("Verify that job is QA Automation Engineer");
       String expectedJob="QA Automation Engineer";
       String actualJob=editProfilePage.getSelectedJob();

       Assert.assertEquals(expectedJob,actualJob);

    }

}
