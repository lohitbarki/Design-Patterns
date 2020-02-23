package com.facade.design;

import java.math.BigDecimal;

/**
 * @author Lohit Barki
 *
 * lohit.barki15@gmail.com
 */
public interface IAccount {

	public void deposit(BigDecimal amt);
	public void withdraw(BigDecimal amt);
	public void transfer(IAccount to, BigDecimal amt);
	public int getAccountNumber();
}
