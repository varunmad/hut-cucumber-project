package com.mobile;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;

public class Amazon {
public static void main(String[] args) throws MalformedURLException {
	DesiredCapabilities cap =new DesiredCapabilities();
	cap.setCapability("deviceName", "OnePlus6");
	cap.setCapability("platformName", "10");
	cap.setCapability("platformVersion", "Android");
	cap.setCapability("appPackage", "in.amazon.mShop.android.shopping");
	cap.setCapability("deviceName", "com.amazon.mShop.search.SearchActivity");
	AppiumDriver<WebElement> driver= new AppiumDriver<WebElement>(new URL("http://0.0.0.0:4723/wd/hub"), cap);
//AndroidDriver<MobileElement>driver=new AndroidDriver<>(new URL("http://0.0.0.0:4723/wd/hub"),cap);
//Thread.sleep(5000);
//MobileElement category=driver.findElement(By.id("action_bar_burger_icon"));
//category.click();


}
}
