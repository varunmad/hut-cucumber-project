package com.hut;

import java.awt.RenderingHints.Key;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.base.BaseClass;

public class ThehutWithoutPom extends BaseClass {
	public static void main(String[] args) throws InterruptedException {
		launchBrowser();
		loadUrl("https://www.thehut.com/");
		WebElement search = driver.findElement(By.xpath("//input[@name='search']"));
		fill(search, "watches");
		Thread.sleep(3000);
		WebElement click = driver.findElement(By.xpath("//button[@class='headerSearch_button']"));
		btnClick(click);
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
		WebElement product = driver.findElement(By.xpath("//a[@data-product-id='11464375']"));
		btnClick(product);
		
		Thread.sleep(5000);
		WebElement addCart = driver.findElement(By.xpath("//button[@data-product-id='11464375']"));
Thread.sleep(5000);
		btnClick(addCart);
		
		WebElement view = driver.findElement(By.xpath("//a[contains(text(),'View Basket')]"));
	    btnClick(view);
	
	WebElement checkout = driver.findElement(By.xpath("//a[@class='responsiveBasket_basketButton responsiveBasket_basketButton-top']"));
	btnClick(checkout);
	
	WebElement name = driver.findElement(By.id("username"));
	fill(name, "varunsathish73@gmail.com");
	WebElement pass = driver.findElement(By.id("password"));
	fill(pass, "9600183978");
	WebElement sub = driver.findElement(By.id("login-submit"));
	btnClick(sub);
	
	WebElement code = driver.findElement(By.id("delivery-post-zip-code"));
	fill(code, "600108");
	WebElement comp = driver.findElement(By.id("delivery-company-name"));
	fill(comp, "titan");
	WebElement hnum = driver.findElement(By.id("delivery-name-number"));
	fill(hnum, "no.123");
	WebElement add1 = driver.findElement(By.id("delivery-street-name"));
	fill(add1, "omr,adayar street");
	WebElement add2 = driver.findElement(By.id("delivery-address-line-2"));
	fill(add2, "anna nagar,chennai");
	WebElement town = driver.findElement(By.id("delivery-town-city"));
	fill(town, "chennai");
	WebElement country = driver.findElement(By.id("delivery-state-province"));
	fill(country, "india");
	WebElement contact = driver.findElement(By.xpath("//input[@class='text span-3 delivery-contact-number-field contact-number-field ']"));
	fill(country, "india");
	}

	
}