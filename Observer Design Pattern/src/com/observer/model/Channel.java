package com.observer.model;

import java.util.ArrayList;
import java.util.List;
import com.observer.design.IObserver;
import com.observer.design.ISubject;

/**
 * @author Lohit Barki
 *
 * lohit.barki15@gmail.com
 */
public class Channel implements ISubject{

	private String channelName;
	private List<IObserver> observerList;
	private String status;

	public Channel(String name,String status){
		this.channelName = name;
		observerList = new ArrayList<IObserver>();
		this.status = status;
	}
	
	@Override
	public void registerObserver(IObserver observer) {
		observerList.add(observer);
	}

	@Override
	public void removeObserver(IObserver observer) {
		observerList.remove(observer);
	}

	@Override
	public void notifyObservers() {
		for(IObserver observer : observerList) {
			observer.update(status);
		}
	}
}
