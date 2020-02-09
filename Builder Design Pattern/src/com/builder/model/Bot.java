package com.builder.model;

/**
 * @author Lohit Barki
 *
 * lohit.barki15@gmail.com
 */
public class Bot implements BotPlan{

	private String head;
	private String hands;
	private String legs;
	private String torso;
	
	@Override
	public void setBotHead(String head) {
		this.head = head;
	}

	@Override
	public void setBotHands(String hands) {
		this.hands = hands;
	}

	@Override
	public void setBotLegs(String legs) {
		 this.legs = legs;
	}

	@Override
	public void setBotBotTorso(String torso) {
		this.torso = torso;
	}
	
	public String getBotHead() {
		return head;
	}
	
	public String getBotHands() {
		return hands;
	}
	
	public String getBotLegs() {
		return legs;
	}
	
	public String getBotTorso() {
		return torso;
	}
}
