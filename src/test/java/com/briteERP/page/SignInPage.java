package com.briteERP.page;

import com.briteERP.utilities.Driver;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {
    public SignInPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//b[contains(text(),'Sign in')]")
    public WebElement signinButton;


    @FindBy(xpath = "//input[@id='login']")
    public WebElement emailIcon;

    @FindBy(id="password")
    public WebElement passwordIcon;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement submitIcon;

    @Test
    public void login(String email,String password){
        this.emailIcon.sendKeys(email);
        this.passwordIcon.sendKeys(password);
        submitIcon.click();
    }
}