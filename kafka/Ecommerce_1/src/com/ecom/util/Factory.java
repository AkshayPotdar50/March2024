package com.ecom.util;
import com.ecom.productinvenory.CartBO;
import com.ecom.productinvenory.ProductBO;

public class Factory {
	private static Style style = new Style();
	private static final String SHOP_NAME = "INDICART";
	private static CartBO cartBO = new CartBO();
	private static ProductBO productBO = new ProductBO();

	public static Style getStyle() {
		return style;
	}

	public static String getShopName() {
		return String.format("%-51s", SHOP_NAME);
	}

	public static CartBO getCartBO() {
		return cartBO;
	}

	public static ProductBO getProductBO() {
		return productBO;
	}

}
