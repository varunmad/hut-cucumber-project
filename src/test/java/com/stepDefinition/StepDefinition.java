package com.stepDefinition;

import org.openqa.selenium.WebElement;

import com.base.BaseClass;
import com.pojo.PojoClass;
import com.pomManager.PojoPom;

import cucumber.api.java.en.*;

public class StepDefinition extends BaseClass {
	PojoPom p=new PojoPom();
	@Given("User is on theHut page")
	public void user_is_on_theHut_page() {
		
		launchBrowser();
		loadUrl("https://www.thehut.com/");
	driver.manage().window().maximize();
	}

	@When("User enters {string}")
	public void user_enters(String s1) {
		WebElement searchProduct = p.getPojo().getSearchProduct();
	fill(searchProduct, s1);
		}
	
	
	@When("User should click the login button")
	public void user_should_click_the_login_button() {
		WebElement btnclick = p.getPojo().getBtnclick();
	javaClick(btnclick);
	}

//	@When("User should click the product")
//	public void user_should_click_the_product() {
//		WebElement product = p.getPojo().getProduct();
//		javaClick(product);
//	}
//
//	@When("User should click the addToCart")
//	public void user_should_click_the_addToCart() {
//		WebElement cart = p.getPojo().getAddCart();
//	javaScroll(cart);
//	javaClick(cart);
//	}
//
//	@When("User should click the view the basket")
//	public void user_should_click_the_view_the_basket() {
//	WebElement view = p.getPojo().getView();	
//	javaClick(view);
//	}
//
//	@When("User should click the checkout")
//	public void user_should_click_the_checkout() {
//		WebElement checkout = p.getPojo().getCheckout();
//	javaClick(checkout);
//	}
//
//	@When("User should click the {string} and {string}")
//	public void user_should_click_the_and(String s1, String s2) {
//		WebElement name = p.getPojo().getName();
//	fill(name, s1);
//	WebElement pass = p.getPojo().getPass();
//	fill(pass, s2);
//	}
//
//	@When("User should click the submit")
//	public void user_should_click_the_submit() {
//WebElement submit = p.getPojo().getSubmit();
//	javaClick(submit);
//	}
//
//	@When("User should click the secure checkout")
//	public void user_should_click_the_secure_checkout() {
//WebElement checkOut = p.getPojo().getCheckOut();
//	javaClick(checkOut);
//	}
//	
//@When("User should select the enter {string},{string},{string},{string},{string},{string},{string},{string}")
//public void user_should_select_the_enter(String string1, String string2, String string3, String string4, String string5, String string6, String string7, String string8) {
//	WebElement postal = p.getPojo().getPostal();
//	fill(postal, string1);
//	WebElement company = p.getPojo().getCompanyNam();
//	fill(company, string2);
//	WebElement house = p.getPojo().getHouseNam();
//	fill(house, string3);
//	WebElement addd = p.getPojo().getAdd();
//	fill(addd, string4);
//	WebElement addd1 = p.getPojo().getAdd1();
//	fill(addd1, string5);
//	WebElement town = p.getPojo().getTown();
//	fill(town, string6);
//	WebElement country = p.getPojo().getCountry();
//	fill(country, string7);
//	WebElement contact = p.getPojo().getContact();
//	fill(contact, string8);
//	
//	}
//	
//	@When("User should select the enter {string},{string},{string}")
//	public void user_should_select_the_enter(String string1, String string2, String string3) {
//		WebElement cno = p.getPojo().getCredit();
//		fill(cno, string1);
//		
//		WebElement cmonth = p.getPojo().getCardmonth();
//		fill(cmonth, string2);
//		
//		WebElement cyear = p.getPojo().getCardYear();
//		fill(cyear, string3);
//		
//			}
//
//	@Then("User should enter the ccv {string}")
//	public void user_should_enter_the_ccv(String s) {
//		WebElement cvv = p.getPojo().getCvv();
//		fill(cvv, s);
//	}
}
