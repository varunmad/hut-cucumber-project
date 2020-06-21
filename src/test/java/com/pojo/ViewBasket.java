package com.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class ViewBasket extends BaseClass {
public ViewBasket() {
	PageFactory.initElements(driver, this);
}
	@FindBy(xpath="//a[contains(text(),'View Basket')]")
	private WebElement view;
	@FindBy(xpath="//button[@class='responsiveBasket_basketButton responsiveBasket_basketButton-top']")
	private WebElement checkout;
	public WebElement getView() {
		return view;
	}
	public WebElement getCheckout() {
		return checkout;
	}

}
