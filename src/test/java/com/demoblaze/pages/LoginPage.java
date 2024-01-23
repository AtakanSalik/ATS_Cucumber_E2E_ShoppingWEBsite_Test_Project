package com.demoblaze.pages;

import com.demoblaze.utilities.BrowserUtils;
import com.demoblaze.utilities.ConfigurationReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{
    @FindBy(id = "loginusername")
    public WebElement l_usernameInputBox;
    @FindBy(id = "loginpassword")
    public WebElement l_passwordInputBox;
    @FindBy(css = "[onclick=\"logIn()\"]")
    public WebElement l_loginBtn;
    public void login(){
        String username = ConfigurationReader.get("username");
        String password = ConfigurationReader.get("password");
        homePage_loginbtn.click();
        l_usernameInputBox.sendKeys(username);
        l_passwordInputBox.sendKeys(password);
        l_loginBtn.click();
    }
    public void login(String username,String password){
       homePage_loginbtn.click();
        l_usernameInputBox.sendKeys(username);
        l_passwordInputBox.sendKeys(password);
        l_loginBtn.click();

    }

}
