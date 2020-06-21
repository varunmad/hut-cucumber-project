package com.base;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	public static WebDriver driver;

	public static void launchBrowser() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\new\\eclipse-workspace\\TheHutCucumberPrac\\driver\\chromedriver.exe");
		driver = new ChromeDriver();

	}

	public static void loadUrl(String search) {
		driver.get(search);
	}

	public static void fill(WebElement ele, String s1) {
		ele.sendKeys(s1);
	}

	public static void btnClick(WebElement ele) {
		ele.click();
	}

	public static void javaSript(String s1, WebElement ele) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('value','s1')", ele);
	}

	public static void javaScroll(WebElement ele) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", ele);
	}

	public static void javaClick(WebElement ele) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", ele);
	}

	public static void select(WebElement ele, String s1) {
		Select s = new Select(ele);
		s.selectByVisibleText(s1);
	}

}