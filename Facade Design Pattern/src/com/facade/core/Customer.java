package com.facade.core;

import java.math.BigDecimal;

import com.facade.design.BankService;

/**
 * @author Lohit Barki
 *
 * lohit.barki15@gmail.com
 */
public class Customer {
	
	public static void main(String[] args) {
		
		BankService bankService = new BankService();
		
		int saving = bankService.createNewAccount("saving", new BigDecimal(500.00));
		
		int investment = bankService.createNewAccount("investment", new BigDecimal(600.00));
		
		bankService.transferMoney(saving, investment, new BigDecimal(100.00));
	}
}
