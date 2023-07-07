package com.krafttechnologie.pages;

import com.krafttechnologie.utilities.BrowserUtils;
import com.krafttechnologie.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserProfilePage extends BasePage{

    @FindBy(css = "[role='alert']")
    public WebElement profileUpdateMessage;

    public void navigateToOverviewMenu(String tab){
       WebElement tabElement=Driver.get().findElement(By.xpath("//li/button[.='"+tab+"']"));
       tabElement.click();

    }

    public String updateMessageGetText(){
        return  updateMessageGetText();
    }


}
