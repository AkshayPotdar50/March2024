package com.ecom.cartlist;
import com.ecom.productinvenory.CartBO;
import com.ecom.util.Factory;
import com.ecom.util.Style;
import com.ecom.util.TakeInput;

public class CartUI {
	private CartBO cartBO;
	private Style style;

	public CartUI() {
		cartBO = Factory.getCartBO();
		style = Factory.getStyle();
	}

	public void viewCart() {
		if (cartBO.isEmpty()) {
			System.out.println("   \u2716 Cart is empty");
		} else {
			cartBO.display();
			System.out.println();
			String option = TakeInput.takeString("Do you want to change the quantity? Y/N : ", "[YNyn]", "option",
					true);
			if (option.equalsIgnoreCase("Y")) {
				modify();
			}
		}
	}

	private void modify() {
		int index = TakeInput.takeInt(cartBO.getNextId() - 1, "Enter the SI.No of item to be quantity : ",
				"Invalid SI.No", "SI.No");
		int quantity = TakeInput.takeInt(0, "Enter the new Quantity : ", "", "");
		cartBO.changeQuantity(index, quantity);
		style.successMsg("Successfully change");
	}

	public void removeCart() {
		if (cartBO.isEmpty()) {
			System.out.println("   \u2716 Cart is empty");
		} else {
			cartBO.display();
			System.out.println();
			String option = TakeInput.takeString("Do you want to remove range? Y/N : ", "[YNyn]", "option", true);
			if (Character.toUpperCase(option.charAt(0)) == 'Y') {
				int[] range = TakeInput.takeRange(cartBO.getNextId() - 1);
				cartBO.removeRange(range[0], range[1]);
			} else {
				int s = TakeInput.takeInt(cartBO.getNextId() - 1, "Enter the SI.No of item to be remove : ",
						"Invalid SI.No", "SI.No");
				cartBO.remove(s);
			}
			style.successMsg("Successfully removed");
		}
	}

	public void viewBill() {
		if (cartBO.isEmpty()) {
			System.out.println("   \u2716 Cart is empty");
		} else {
			style.printName(Factory.getShopName());
			style.printDateAndTime();
			cartBO.displayBill();
		}
		style.thanksMsg();
	}
}
