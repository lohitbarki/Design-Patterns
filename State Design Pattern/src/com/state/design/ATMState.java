package com.state.design;

import com.state.model.ATMMachine;

/**
 * @author Lohit Barki
 *
 * lohit.barki15@gmail.com
 */
public interface ATMState {

	public void insertCard(ATMMachine atmMachine);
	public void dispenseMoney(ATMMachine atmMachine);
	public void ejectCard(ATMMachine atmMachine);
}
