package com.composite.design;

/**
 * @author Lohit Barki
 *
 * lohit.barki15@gmail.com
 */
public interface IComponent {

	public void play();
	public void setPlaybackSpeed(float speed);
	public String getName();
}
