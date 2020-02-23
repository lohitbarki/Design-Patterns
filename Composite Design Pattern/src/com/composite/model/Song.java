package com.composite.model;
import com.composite.design.IComponent;

/**
 * @author Lohit Barki
 *
 * lohit.barki15@gmail.com
 */
public class Song implements IComponent{

	public String songName;
	public String artist;
	public float speed = 1; // Default playback speed

	public Song(String songName, String artist ) {
		this.songName = songName;
		this.artist = artist; 
	}

	@Override
	public void play() {
		System.out.println("Playing " + songName + "song");
	}

	@Override
	public void setPlaybackSpeed(float speed) {
		System.out.println("Play Back speed is set to : " + speed);
	}

	@Override
	public String getName() {
		return songName;
	}
	
	public String getArtist() {
		return artist;
	}
}
