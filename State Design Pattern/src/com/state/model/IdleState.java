package com.state.model;

import com.state.design.ATMState;

/**
 * @author Lohit Barki
 *
 * lohit.barki15@gmail.com
 */
public class IdleState implements ATMState{

	@Override
	public void insertCard(ATMMachine atmMachine) {
		System.out.println("Card inserted !!");
		atmMachine.setState(atmMachine.getHasCardState());
	}

	@Override
	public void dispenseMoney(ATMMachine atmMachine) {
		System.out.println("Please insert card..");
	}

	@Override
	public void ejectCard(ATMMachine atmMachine) {
		System.out.println("No card found!!");
	}

}
