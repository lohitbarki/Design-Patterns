package com.mediator.model;

import com.mediator.design.IChatRoom;
import com.mediator.design.User;

/**
 * @author Lohit Barki
 *
 * lohit.barki15@gmail.com
 */
public class ChatRoomImpl implements IChatRoom{

	@Override
	public void showMsg(String msg, User user) {
		
		System.out.println("User : " + user.getName() + " Message is :" + msg);
	}
	
}
