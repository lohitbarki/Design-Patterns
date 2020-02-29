package com.observer.model;

import com.observer.design.IObserver;

/**
 * @author Lohit Barki
 *
 * lohit.barki15@gmail.com
 */
public class Follower implements IObserver{

	private String follwerName;
	
	public Follower(String name){
		this.follwerName = name;
	}
	
	@Override
	public void update(String status) {
		System.out.println(status);
	}
	
	public void play() {
		System.out.println("Playing video..");
	}
}
