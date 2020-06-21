package com.pomManager;

import com.pojo.AddtoCart;
import com.pojo.Items;
import com.pojo.LoginFunctionalty;
import com.pojo.PaymentPage;
import com.pojo.SearchProduct;
import com.pojo.ViewBasket;

public class POMManager {
	private SearchProduct search;
private AddtoCart add;
private ViewBasket basket;
private Items product;
private LoginFunctionalty login;
private PaymentPage payment;
public SearchProduct getSearch() {
	return search;
}
public AddtoCart getAdd() {
	return add;
}
public ViewBasket getBasket() {
	return basket;
}
public Items getProduct() {
	return product;
}
public LoginFunctionalty getLogin() {
	return login;
}
public PaymentPage getPayment() {
	return payment;
}






}
