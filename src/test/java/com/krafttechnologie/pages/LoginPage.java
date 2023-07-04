package com.krafttechnologie.pages;

import com.krafttechnologie.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage{




    @FindBy(css = "#email")
    public WebElement emailInputBox;


    @FindBy(css = "#yourPassword")
    public WebElement passwordInputBox;


    @FindBy(xpath = "//button[text()='Login']")
    public WebElement loginButton;


    @FindBy(xpath = "//div[contains(text(),'incorrect')]")
    public WebElement wrongPasswordAlert;

    @FindBy(xpath = "//div[contains(text(),'address')]")
    public WebElement wrongEmailAlert;




}
