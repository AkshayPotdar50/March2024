package com.ecom.cartlist;

import com.ecom.productinvenory.ProductBO;
import com.ecom.util.Factory;
import com.ecom.util.TakeInput;

public class Women implements UICategory {

	@Override
	public void category() {
		String categories[] = { "Sarees", "Kurtas & Kurtis", "Lehenga Choli" };
		Factory.getStyle().printMenu("Women", categories, false);
		int choice = TakeInput.takeChoice(categories.length);
		ProductBO productBO = Factory.getProductBO();
		switch (choice) {
		case 1:
			UI.printSubCategory(productBO.getSareeList(), "Sarees");
			break;
		case 2:
			UI.printSubCategory(productBO.getKurtas(), "Kurtas & Kurtis");
			break;
		case 3:
			UI.printSubCategory(productBO.getLc(), "Lehenga Choli");
			break;
		}
	}
}