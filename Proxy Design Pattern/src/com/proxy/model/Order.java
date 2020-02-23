package com.proxy.model;

import java.util.List;

/**
 * @author Lohit Barki
 *
 * lohit.barki15@gmail.com
 */
public class Order {
	
	private List<Item> itemList;

	public List<Item> getItemList() {
		return itemList;
	}

	public void setItemList(List<Item> itemList) {
		this.itemList = itemList;
	}
}
