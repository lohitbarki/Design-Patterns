package com.composite.model;
import java.util.ArrayList;

import com.composite.design.IComponent;

/**
 * @author Lohit Barki
 *
 * lohit.barki15@gmail.com
 */
public class Playlist implements IComponent{

	public String playlistName;
	public ArrayList<IComponent> playlist = new ArrayList<IComponent>();

	public Playlist(String playlistName) {
		this.playlistName = playlistName;
	}

	@Override
	public void play() {
		System.out.println("Playing song from " + playlistName + "playlist");
	}

	@Override
	public void setPlaybackSpeed(float speed) {
		System.out.println("Play Back speed is set to : " + speed);
	}

	@Override
	public String getName() {
		return playlistName;
	}

	public void add(IComponent comp) {
		this.playlist.add(comp);
	}
}
