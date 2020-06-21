package com.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class AddtoCart extends BaseClass {
public AddtoCart() {
	PageFactory.initElements(driver, this);
}
@FindBy(xpath="//button[contains(text(),'Add to Basket')]")
private WebElement addCart;
public WebElement getAddCart() {
	return addCart;
}

}
