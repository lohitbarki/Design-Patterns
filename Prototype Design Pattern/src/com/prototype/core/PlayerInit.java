package com.prototype.core;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.prototype.model.PlayerRecord;

/**
 * @author Lohit Barki
 *
 * lohit.barki15@gmail.com
 */
public class PlayerInit {

	public static void main(String[] args) throws IOException {
		
		String name;
		String address;
		String sport;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter Player name : ");
		name = br.readLine();
		
		System.out.println("Enter Player address: ");
		address = br.readLine();
		
		System.out.println("Enter sport : ");
		sport = br.readLine();
		
		PlayerRecord playerNew = new PlayerRecord(name, address, sport);
		playerNew.displayRecord();
		
		PlayerRecord playerClone = (PlayerRecord) playerNew.getClone();
		playerClone.displayRecord();
	}
}
