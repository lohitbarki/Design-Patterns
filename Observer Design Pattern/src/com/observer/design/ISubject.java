package com.observer.design;


/**
 * @author Lohit Barki
 *
 * lohit.barki15@gmail.com
 */
public interface ISubject {

	public void registerObserver(IObserver observer);
	public void removeObserver(IObserver observer);
	public void notifyObservers();
}
