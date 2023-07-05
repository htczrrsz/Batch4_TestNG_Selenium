package com.krafttechnologie.pages;

import com.krafttechnologie.utilities.ConfigurationReader;
import com.krafttechnologie.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
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



//   AND logic   --> ikisi ayni elementi locate etmeli
    @FindBys({
            @FindBy(css="#email"),
            @FindBy(name="email")
    })
    public WebElement emailInputBoxWithFindBys;



//   OR logic   --> usttekinde bulursa alta bakmiyor
    @FindAll({
            @FindBy(id="email"),
            @FindBy(name = "anotherName")
    })
    public WebElement emailInputBoxWithFindAll;



    public void login(String userEmail, String password){
        emailInputBox.sendKeys(userEmail);
        passwordInputBox.sendKeys(password);
        loginButton.click();
    }


//method overloading
    public void login(){
        emailInputBox.sendKeys(ConfigurationReader.get("userEmail"));
        passwordInputBox.sendKeys(ConfigurationReader.get("userPassword"));
        loginButton.click();
    }


}
