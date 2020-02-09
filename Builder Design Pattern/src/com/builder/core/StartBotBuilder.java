package com.builder.core;

import com.builder.design.BotBuilder;
import com.builder.design.BotEngineer;
import com.builder.design.OldStyleBotBuilder;
import com.builder.model.Bot;

/**
 * @author Lohit Barki
 *
 * lohit.barki15@gmail.com
 */
public class StartBotBuilder {

	public static void main(String[] args) {
		
		BotBuilder oldStyleBot = new OldStyleBotBuilder();
		
		BotEngineer botEngineer = new BotEngineer(oldStyleBot);
		
		botEngineer.assembleBot();
		
		Bot bot = botEngineer.getBot();
		
		System.out.println("******  Bot Specs **********");
		System.out.println(bot.getBotHead());
		System.out.println(bot.getBotHands());
		System.out.println(bot.getBotLegs());
		System.out.println(bot.getBotTorso());
	}
}
