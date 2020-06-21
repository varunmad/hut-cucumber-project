package com.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class SearchProduct extends BaseClass {
	public SearchProduct() {
	
	PageFactory.initElements(driver, this);
	}
@FindBy(name="search")
private WebElement searchProduct;
@FindBy(xpath="//button[@type='submit']")
private WebElement btnclick;
public WebElement getSearchProduct() {
	return searchProduct;
}
public WebElement getBtnclick() {
	return btnclick;
}



}
