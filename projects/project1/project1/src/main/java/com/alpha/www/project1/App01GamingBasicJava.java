package com.alpha.www.project1;

import com.alpha.www.project1.game.GameRunner;
import com.alpha.www.project1.game.MarioGame;
import com.alpha.www.project1.game.PacmanGame;
import com.alpha.www.project1.game.SuperContraGame;

public class App01GamingBasicJava {

	public static void main(String[] args) {
//		var game = new MarioGame();
//		var game = new SuperContraGame();
		var game = new PacmanGame();
		var gameRunner = new GameRunner(game);
		gameRunner.run();
	}

}
