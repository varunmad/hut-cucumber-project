package com.hut;

import com.base.BaseClass;
import com.pojo.PojoClass;

public class TheHut extends BaseClass {
	public static void main(String[] args) {
		launchBrowser();
		loadUrl("https://www.thehut.com/");
		driver.manage().window().maximize();
		PojoClass p = new PojoClass();
				fill(p.getSearchProduct(),"watches");
		javaClick(p.getBtnclick());
	javaClick(p.getProduct());
		javaScroll(p.getAddCart());
		javaClick(p.getAddCart());
		javaClick(p.getView());
		javaClick(p.getCheckout());
		fill(p.getName(), "varunsathish73@gmail.com");
		fill(p.getPass(), "ecommerce100");
		javaClick(p.getSubmit());
		javaClick(p.getCheckOut());
		fill(p.getPostal(), "600108");
		fill(p.getCompanyNam(), "Water");
		fill(p.getHouseNam(), "House");
		fill(p.getAdd(), "no123,omr,adayar street");
		fill(p.getAdd1(), "anna nagar,chennai");
		fill(p.getTown(), "chennai");
		fill(p.getCountry(), "India");
		fill(p.getContact(), "9876543210");
fill(p.getCredit(),"9876-1234-1298");
fill(p.getCardmonth(),"07");
	fill(p.getCardYear(), "22");
	fill(p.getCvv(),"456");
	
	}
}
