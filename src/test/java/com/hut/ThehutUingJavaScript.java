package com.hut;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ThehutUingJavaScript {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\new\\eclipse-workspace\\AAhut\\src\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.thehut.com/");
	driver.getCurrentUrl();
	driver.manage().window().maximize();
	driver.findElement(By.name("search")).sendKeys("watches",Keys.ENTER);
	Thread.sleep(3000);
	JavascriptExecutor js=(JavascriptExecutor)driver;
	WebElement search = driver.findElement(By.id("productBlock_productName-12306027"));
	js.executeScript("arguments[0].click()", search);
	driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);	
WebElement addToCart = driver.findElement(By.xpath("//button[contains(text(),'Add to Basket')]"));
	driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
	js.executeScript("arguments[0].scrollIntoView(true)",addToCart);
	driver.manage().timeouts().implicitlyWait(200,TimeUnit.SECONDS);
  js.executeScript("arguments[0].click()", addToCart);
  System.out.println("launch");
    driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
   WebElement viewBasket = driver.findElement(By.xpath("//a[contains(text(),'View Basket')]"));
   driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
js.executeScript("arguments[0].click()",viewBasket);
WebElement checkOut = driver.findElement(By.xpath("//button[@class='responsiveBasket_basketButton responsiveBasket_basketButton-top']"));
driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
js.executeScript("arguments[0].click()",checkOut);
WebElement name = driver.findElement(By.id("username"));
driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
js.executeScript("arguments[0].setAttribute('value','varunsathish73@gmail.com')",name);
WebElement pass = driver.findElement(By.id("password"));
driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
js.executeScript("arguments[0].setAttribute('value','ecommerce100')",pass);
WebElement login = driver.findElement(By.id("login-submit"));
driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
js.executeScript("arguments[0].click()",login);

WebElement check = driver.findElement(By.xpath("//button[@class='responsiveBasket_basketButton responsiveBasket_basketButton-top']"));
driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
js.executeScript("arguments[0].click()",check);

WebElement post = driver.findElement(By.id("delivery-post-zip-code"));
driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
js.executeScript("arguments[0].setAttribute('value','600108')",post);

WebElement company = driver.findElement(By.id("delivery-company-name"));
driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
js.executeScript("arguments[0].setAttribute('value','ntrust')",company);
	
WebElement hno = driver.findElement(By.id("delivery-name-number"));
driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
js.executeScript("arguments[0].setAttribute('value','house')",hno);
	
	
WebElement add1 = driver.findElement(By.id("delivery-street-name"));
driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
js.executeScript("arguments[0].setAttribute('value','12,omr')",add1);
	
WebElement add2 = driver.findElement(By.id("delivery-address-line-2"));
driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
js.executeScript("arguments[0].setAttribute('value','adayar,beach')",add2);
	
WebElement town = driver.findElement(By.id("delivery-town-city"));
driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
js.executeScript("arguments[0].setAttribute('value','chennai')",town);
	
WebElement country = driver.findElement(By.id("delivery-state-province"));
driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
js.executeScript("arguments[0].setAttribute('value','india')",country);
	
WebElement contact = driver.findElement(By.id("order-contact-number"));
driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
js.executeScript("arguments[0].setAttribute('value','9876543210')",contact);
	
//WebElement pass = driver.findElement(By.id("password"));
//driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
//js.executeScript("arguments[0].setAttribute('value','ecommerce100')",pass);
	
	
	
	
	
	
	
	}
}
