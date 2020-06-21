package com.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class LoginFunctionalty extends BaseClass {
public LoginFunctionalty() {
	PageFactory.initElements(driver, this);
}
@FindBy(id="username")
private WebElement name;
@FindBy(id="password")
private WebElement pass;
@FindBy(id="login-submit")
private WebElement submit;
public WebElement getName() {
	return name;
}
public WebElement getPass() {
	return pass;
}
public WebElement getSubmit() {
	return submit;
}


}
