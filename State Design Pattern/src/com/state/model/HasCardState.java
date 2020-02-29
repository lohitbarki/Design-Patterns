package com.state.model;

import com.state.design.ATMState;

/**
 * @author Lohit Barki
 *
 * lohit.barki15@gmail.com
 */
public class HasCardState implements ATMState{

	@Override
	public void insertCard(ATMMachine atmMachine) {
		System.out.println("Card already inserted..");
		atmMachine.setState(atmMachine.getIdleState());
	}

	@Override
	public void dispenseMoney(ATMMachine atmMachine) {
		double amount = 2000;
		if(atmMachine.getCount()>1) {
			System.out.println("Dispensing amount.." + amount);
			atmMachine.setCount(atmMachine.getCount()-amount);
			atmMachine.setState(atmMachine.getIdleState());
		}
		else {
			System.out.println("Out of cash!!");
			atmMachine.setState(atmMachine.getOutOfCashState());
		}
	}

	@Override
	public void ejectCard(ATMMachine atmMachine) {
		// TODO Auto-generated method stub
		
	}

}
