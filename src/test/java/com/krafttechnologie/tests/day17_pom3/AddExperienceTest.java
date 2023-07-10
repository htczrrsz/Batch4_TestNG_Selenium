package com.krafttechnologie.tests.day17_pom3;

import com.krafttechnologie.pages.AddExperiencePage;
import com.krafttechnologie.pages.LoginPage;
import com.krafttechnologie.pages.UserProfilePage;
import com.krafttechnologie.tests.TestBase;
import com.krafttechnologie.utilities.ConfigurationReader;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddExperienceTest extends TestBase {


    @Test
    public void addExperience() throws InterruptedException {
        LoginPage loginPage= new LoginPage();
        AddExperiencePage addExperiencePage= new AddExperiencePage();
        UserProfilePage userProfilePage= new UserProfilePage();

        driver.get(ConfigurationReader.get("url"));
        loginPage.login();
        loginPage.userAccountName.click();
        loginPage.navigateToModule("My Profile");
        userProfilePage.navigateToOverviewMenu("Add Experience");

        addExperiencePage.jobTitleInput.clear();
        addExperiencePage.jobTitleInput.sendKeys("QA Tester");
        addExperiencePage.companyInputBox.clear();
        addExperiencePage.companyInputBox.sendKeys("Apple");
        addExperiencePage.locationInputBox.clear();
        addExperiencePage.locationInputBox.sendKeys("USA");
        addExperiencePage.fromDateInputBox.sendKeys("02022024");

        addExperiencePage.toDateInputBox.sendKeys("07092025");
        addExperiencePage.jobDescriptionInputBox.sendKeys("Automation Test");
        addExperiencePage.addExperienceButton.click();


        String expectedUrl="https://www.krafttechexlab.com/myprofile";
        String actualUrl=driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);

       addExperiencePage.experienceDetails();



    }


}
