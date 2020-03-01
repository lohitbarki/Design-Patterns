package com.mediator.core;

import com.mediator.design.IChatRoom;
import com.mediator.design.User;
import com.mediator.model.*;

/**
 * @author Lohit Barki
 *
 * lohit.barki15@gmail.com
 * 
 * Demo on Mediator pattern
 */

public class StartChatting {

	public static void main(String[] args) {
		
		IChatRoom chatRoom = new ChatRoomImpl();
		
		User user1 = new User1(chatRoom);
		User user2 = new User2(chatRoom);
		
		user1.setName("User1");
		user2.setName("User2");
		
		user1.sendMsg("Hi, How are you?");
		user2.sendMsg("Hey, I'm good!!");
	}
}
