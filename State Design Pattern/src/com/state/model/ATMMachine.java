package com.state.model;

import com.state.design.ATMState;

/**
 * @author Lohit Barki
 *
 * lohit.barki15@gmail.com
 */
public class ATMMachine{
	
	private ATMState idleState;
	private ATMState hasCardState;
	private ATMState outOfCashState;
	
	private ATMState currentState;
	private double count;
	
	public void ATMMachine(double count) {
		idleState = new IdleState();
		hasCardState = new HasCardState();
		outOfCashState = new OutOfCashState();
		if(count>0) {
			this.count = count;
			currentState = idleState;
		}
		else {
			this.count = 0;
			currentState = outOfCashState;
		}
	}
	
	public double getCount() {
		return count;
	}
	public void setCount(double d) {
		this.count = d;
	}
	public ATMState getHasCardState() {
		return hasCardState;
	}
	public ATMState getIdleState() {
		return idleState;
	}
	public ATMState getOutOfCashState() {
		return outOfCashState;
	}
	public void setState(ATMState state) {
		this.currentState = state;
	}

	public void insertCard() {
		currentState.insertCard(this);
	}

	public void dispenseMoney() {
		currentState.dispenseMoney(this);
	}

	public void ejectCard() {
		currentState.ejectCard(this);
	}
}
