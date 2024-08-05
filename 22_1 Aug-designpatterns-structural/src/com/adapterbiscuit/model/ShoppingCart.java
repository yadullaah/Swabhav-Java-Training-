package com.adapterbiscuit.model;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

	private List<IItems> cartItems;

	public ShoppingCart() {
		cartItems = new ArrayList<>();
	}

	public void addItemToCart(IItems item) {
		cartItems.add(item);
	}

	public List<IItems> getCartItems() {
		return cartItems;
	}

	public double getCartPrice() {
		double total = 0;
		for (IItems item : cartItems) {
			total += item.getItemPrice();
		}
		return total;
	}
}
