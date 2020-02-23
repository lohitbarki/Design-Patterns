package com.proxy.design;


import java.util.List;

import com.proxy.model.Order;
import com.proxy.model.Warehouse;

/**
 * @author Lohit Barki
 *
 * lohit.barki15@gmail.com
 * 
 * Proxy class which checks each warehose for stock
 */
public class OrderFullfillment implements IOrder{

	private List<Warehouse> warehouseList;
	@Override
	public void fulfillOrder(Order order) {
		for(Warehouse warehouse : warehouseList) {
			/*
			 * logic to check whether a warehose has
			 * ordered items or not. If item found then
			 * get order from that warehouse
			 * 
			 */
		}
	}

}
