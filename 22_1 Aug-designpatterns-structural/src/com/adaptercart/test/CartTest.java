package com.adaptercart.test;

import java.util.ArrayList;
import java.util.List;

import com.adapterbiscuit.model.*;

public class CartTest {
	public static void main(String[] args) {

		List<IItems> cartItem = new ArrayList();

		ShoppingCart cart = new ShoppingCart();

		cart.addItemToCart(new Biscuit("oreo", 20.0));
		cart.addItemToCart(new Biscuit("good day", 80.0));

		cart.addItemToCart(new HatAdapter(new Hat("Long", "Short", 100.0, 20.0)));
		cart.addItemToCart(new HatAdapter(new Hat("Long1", "Short2", 200.0, 30.0)));

		System.out.println("Total price of cart is " + cart.getCartPrice());

	}

}
