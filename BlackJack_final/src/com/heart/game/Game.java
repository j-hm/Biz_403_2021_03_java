package com.heart.game;

import com.heart.impl.BlackJackRuleImplV1;
import com.heart.service.BlackjackRule3;

public class Game {
	public static void main(String[] args) {
		
		BlackjackRule3 bj = new BlackJackRuleImplV1();
		
		bj.gameMainScreen();
		
		
	}
}
