package com.proxy.model;

import java.util.HashMap;

import com.proxy.design.IOrder;

/**
 * @author Lohit Barki
 *
 * lohit.barki15@gmail.com
 */
public class Warehouse implements IOrder{
	
	private String address;
	private HashMap<String, Integer> stock;
	
	@Override
	public void fulfillOrder(Order order) {
		for(Item item : order.getItemList()) {
			item.setCount(item.getCount()-1);
		}
	}
	public int currentInventory(Item item) {
		if(stock.containsKey(item.getName()))
			return item.getCount();
		return 0;
	}
}
