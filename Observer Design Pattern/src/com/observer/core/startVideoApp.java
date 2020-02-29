package com.observer.core;

import com.observer.design.IObserver;
import com.observer.design.ISubject;
import com.observer.model.Channel;
import com.observer.model.Follower;

/**
 * @author Lohit Barki
 *
 * lohit.barki15@gmail.com
 */
public class startVideoApp {
	
	public static void main(String[] args) {
		
		IObserver follower1 = new Follower("follower1");
		IObserver follower2 = new Follower("follower2");
		
		ISubject myChannel = new Channel("MyChannel","New video");
		myChannel.registerObserver(follower1);
		myChannel.registerObserver(follower2);
		myChannel.notifyObservers();
	}
}
