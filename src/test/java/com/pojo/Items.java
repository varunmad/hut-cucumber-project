package com.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class Items extends BaseClass  {
	public Items() {
		PageFactory.initElements(driver, this);
		}
	@FindBy(id="productBlock_productName-12306027")
	private WebElement product;
	public WebElement getProduct() {
		return product;
	}
	
	
}
