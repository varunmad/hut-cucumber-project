package com.mobile;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Calc {
	public static void main(String[] args) throws Exception {
		DesiredCapabilities cap =new DesiredCapabilities();
		cap.setCapability("deviceName", "OnePlus6");
		cap.setCapability("platformName", "10");
		cap.setCapability("platformVersion", "Android");
		cap.setCapability("appPackage", "com.oneplus.calculator");
		cap.setCapability("deviceName", "com.oneplus.calculator.Calculator");
		
	AndroidDriver<MobileElement> driver= new AndroidDriver<MobileElement>(new URL("http://192.168.1.4:4723/wd/hub"), cap);
driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	MobileElement one=driver.findElement(By.id("digit_1"));
	one.click();
	MobileElement plus=driver.findElement(By.id("op_add"));
	plus.click();
	MobileElement six=driver.findElement(By.id("digit_6"));
	six.click();
	MobileElement sum=driver.findElement(By.id("eq"));
	sum.click();
	
	}
	}


