package com.facade.design;

import java.math.BigDecimal;
import java.util.Hashtable;

import com.facade.model.Cheque;
import com.facade.model.Investment;
import com.facade.model.Saving;

/**
 * @author Lohit Barki
 *
 * lohit.barki15@gmail.com
 */
public class BankService {
	
	private Hashtable<Integer, IAccount> bankAccounts;
	public BankService() {
		bankAccounts = new Hashtable<Integer, IAccount>();
	}
	
	public int createNewAccount(String type, BigDecimal amt) {
		
		IAccount newAccount = null;
		
		switch(type) {
			case "cheque" : 
				newAccount = new Cheque();
				break;
			case "saving" : 
				newAccount = new Saving();
				break;
			case "investment" : 
				newAccount = new Investment();
				break;
			default : 
				System.out.println("Invalid account type!!");
				break;
		}
		if(newAccount != null) {
			this.bankAccounts.put(newAccount.getAccountNumber(), newAccount);
			newAccount.getAccountNumber();
		}
		return -1;
	}
	
	public void transferMoney(int from, int to, BigDecimal amt) {
		IAccount fromAccount = bankAccounts.get(from);
		IAccount toAccount = bankAccounts.get(to);
		fromAccount.transfer(toAccount, amt);
	}
}
