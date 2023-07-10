package com.krafttechnologie.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddExperiencePage extends BasePage{

    @FindBy(xpath = "//input[@id='job']")
    public WebElement jobTitleInput;

    @FindBy(xpath = "(//input[@id='company'])[2]")
    public WebElement companyInputBox;

    @FindBy(xpath = "(//input[@id='location'])[2]")
    public WebElement locationInputBox;

    @FindBy(xpath = "(//input[@id='fromdate'])[1]")
    public WebElement fromDateInputBox;

    @FindBy(id = "todateexp")
    public WebElement toDateInputBox;

    @FindBy(xpath = "//label[text()='Job Description']/..//textarea")
    public WebElement jobDescriptionInputBox;

    @FindBy(css = "[value='experience']")
    public WebElement addExperienceButton;


    @FindBy(xpath = "//h5[text()='Experience Details']/..//tr")
    public WebElement experienceDetails;


    public String experienceDetails(){
      return  experienceDetails.getText();
    }




    
}
