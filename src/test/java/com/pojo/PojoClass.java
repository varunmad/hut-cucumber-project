package com.pojo;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class PojoClass extends BaseClass {
	public PojoClass() {
		PageFactory.initElements(driver, this);
	}
@FindBy(name="search")
private WebElement searchProduct;
@FindBy(xpath="//button[@type='submit']")
private WebElement btnclick;
@FindBy(id="productBlock_productName-12306027")
private WebElement product;
@FindBy(xpath="//button[contains(text(),'Add to Basket')]")
private WebElement addCart;
@FindBy(xpath="//a[contains(text(),'View Basket')]")
private WebElement view;
@FindBy(xpath="//button[@class='responsiveBasket_basketButton responsiveBasket_basketButton-top']")
private WebElement checkout;
@FindBy(id="username")
private WebElement name;
@FindBy(id="password")
private WebElement pass;
@FindBy(id="login-submit")
private WebElement submit;
@FindBy(xpath="//button[@class='responsiveBasket_basketButton responsiveBasket_basketButton-top']")
private WebElement checkOut;
@FindBy(id="delivery-post-zip-code")
private WebElement postal;
@FindBy(id="delivery-company-name")
private WebElement companyNam;
@FindBy(id="delivery-name-number")
private WebElement houseNam;
@FindBy(id="delivery-street-name")
private WebElement add;
@FindBy(id="delivery-address-line-2")
private WebElement add1;
@FindBy(id="delivery-town-city")
private WebElement town;
@FindBy(id="delivery-state-province")
private WebElement country;
@FindBy(id="order-contact-number")
private WebElement contact;
@FindBy(id="credit-card-num")
private WebElement credit;
@FindBy(id="expiration-month")
private WebElement cardmonth;

@FindBy(id="expiration-year")
private WebElement cardYear;

@FindBy(id="credit-card-cv2")
private WebElement cvv;


public WebElement getBtnclick() {
	return btnclick;
}
public WebElement getProduct() {
	return product;
}
public WebElement getAddCart() {
	return addCart;
}
public WebElement getCredit() {
	return credit;
}
public WebElement getCardmonth() {
	return cardmonth;
}
public WebElement getCardYear() {
	return cardYear;
}
public WebElement getCvv() {
	return cvv;
}
public WebElement getView() {
	return view;
}
public WebElement getCheckout() {
	return checkout;
}
public WebElement getName() {
	return name;
}
public WebElement getSearchProduct() {
	return searchProduct;
}
public WebElement getPass() {
	return pass;
}
public WebElement getSubmit() {
	return submit;
}
public WebElement getPostal() {
	return postal;
}
public WebElement getCompanyNam() {
	return companyNam;
}
public WebElement getCheckOut() {
	return checkOut;
}
public WebElement getHouseNam() {
	return houseNam;
}
public WebElement getAdd() {
	return add;
}
public WebElement getAdd1() {
	return add1;
}
public WebElement getTown() {
	return town;
}
public WebElement getCountry() {
	return country;
}
public WebElement getContact() {
	return contact;
}



}

