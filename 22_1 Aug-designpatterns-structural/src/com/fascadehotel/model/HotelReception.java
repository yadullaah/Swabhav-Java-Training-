package com.fascadehotel.model;

public class HotelReception {
	
	public void IndianMenu() {
		IHotel indianhotel = new IndianHotel();
		IMenu indianmenu = new IndianMenu();
		indianmenu.displayMenu();
	}
	
	public void ItalianMenu() {
		IHotel italianhotel = new ItalianHotel();
		IMenu italianmenu = new ItalianMenu();
		italianmenu.displayMenu();
	}

}
