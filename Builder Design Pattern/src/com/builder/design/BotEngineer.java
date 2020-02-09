package com.builder.design;

import com.builder.model.Bot;

/**
 * @author Lohit Barki
 *
 * lohit.barki15@gmail.com
 */
public class BotEngineer {
	
	private BotBuilder botBuilder;
	
	public BotEngineer(BotBuilder botBuilder) {
		this.botBuilder = botBuilder;
	}
	
	public Bot getBot() {
		return botBuilder.getBot();
	}
	
	public void assembleBot() {
		
		botBuilder.buildBotHead();
		botBuilder.buildBotHands();
		botBuilder.buildBotLegs();
		botBuilder.buildBotTorso();
	}
}
