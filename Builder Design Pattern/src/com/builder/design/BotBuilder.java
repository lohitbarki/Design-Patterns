package com.builder.design;

import com.builder.model.Bot;

/**
 * @author Lohit Barki
 *
 * lohit.barki15@gmail.com
 */
public interface BotBuilder {
	
	public void buildBotHead();
	public void buildBotHands();
	public void buildBotLegs();
	public void buildBotTorso();
	public Bot getBot();
}
