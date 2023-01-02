package com.alpha.www.project1;

import com.alpha.www.project1.game.GameRunner;
import com.alpha.www.project1.game.MarioGame;
import com.alpha.www.project1.game.SuperContraGame;

public class AppGamingBasicJava {

	public static void main(String[] args) {
//		var marioGame = new MarioGame();
		var superContraGame = new SuperContraGame();
		var gameRunner = new GameRunner(superContraGame);
		gameRunner.run();
	}

}
