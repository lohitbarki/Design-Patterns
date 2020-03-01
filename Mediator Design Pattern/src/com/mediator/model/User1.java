package com.mediator.model;

import com.mediator.design.IChatRoom;
import com.mediator.design.User;

/**
 * @author Lohit Barki
 *
 * lohit.barki15@gmail.com
 */
public class User1 extends User{

	public User1(IChatRoom chatRoom){
		this.chatRoom = chatRoom;
	}
	
	@Override
	public void sendMsg(String msg) {
		chatRoom.showMsg(msg, this);
	}

}
