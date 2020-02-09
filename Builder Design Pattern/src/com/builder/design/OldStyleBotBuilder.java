package com.builder.design;

import com.builder.constants.Constants;
import com.builder.model.Bot;

/**
 * @author Lohit Barki
 *
 * lohit.barki15@gmail.com
 */
public class OldStyleBotBuilder implements BotBuilder{

	private Bot bot;
	
	public OldStyleBotBuilder() {
		bot = new Bot();
	}
	
	@Override
	public void buildBotHead() {
		bot.setBotHead(Constants.GHEAD);
	}

	@Override
	public void buildBotHands() {
		bot.setBotHands(Constants.GHANDS);
	}

	@Override
	public void buildBotLegs() {
		bot.setBotLegs(Constants.GLEGS);
	}

	@Override
	public void buildBotTorso() {
		bot.setBotBotTorso(Constants.GTORSO);
	}

	@Override
	public Bot getBot() {
		return bot;
	}
	
}
