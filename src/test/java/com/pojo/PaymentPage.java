package com.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class PaymentPage extends BaseClass {
public PaymentPage() {
	PageFactory.initElements(driver, this);
}
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

public WebElement getCheckOut() {
	return checkOut;
}

public WebElement getPostal() {
	return postal;
}

public WebElement getCompanyNam() {
	return companyNam;
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


}
