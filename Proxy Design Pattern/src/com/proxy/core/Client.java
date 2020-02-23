package com.proxy.core;

import java.util.LinkedList;
import java.util.List;

import com.proxy.design.IOrder;
import com.proxy.design.OrderFullfillment;
import com.proxy.model.Item;
import com.proxy.model.Order;

/**
 * @author Lohit Barki
 *
 * lohit.barki15@gmail.com
 */
public class Client {
	
	public static void main(String[] args) {
		
		IOrder order = new OrderFullfillment();
		Order myOrder = new Order();
		List<Item> itemList = new LinkedList<Item>();
		
		Item laptop = new Item("Laptop");
		Item mobile = new Item("Mobile");
		
		itemList.add(laptop);
		itemList.add(mobile);
		
		myOrder.setItemList(itemList);
		order.fulfillOrder(myOrder);
		
	}
}
