package com.mediator.design;

/**
 * @author Lohit Barki
 *
 * lohit.barki15@gmail.com
 */

public abstract class User {
	
	private String name;
	protected IChatRoom chatRoom;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public abstract void sendMsg(String msg); 
}
