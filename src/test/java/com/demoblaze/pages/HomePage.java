package com.demoblaze.pages;

import com.demoblaze.utilities.BrowserUtils;
import com.demoblaze.utilities.ConfigurationReader;
import org.junit.Assert;

public class HomePage extends BasePage{
public void verifyWelcomeMessage(){
    BrowserUtils.waitForVisibility(l_nameOfUser,5);
    String actualMessage=l_nameOfUser.getText();
    Assert.assertTrue(actualMessage.contains(ConfigurationReader.get("username")));
}
public void verifyWelcomeMessage(String username){
    BrowserUtils.waitForVisibility(l_nameOfUser,5);
    String actualMessage=l_nameOfUser.getText();
    Assert.assertTrue(actualMessage.contains(username));
}
}
