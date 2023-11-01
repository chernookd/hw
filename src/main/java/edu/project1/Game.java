package edu.project1;

public class Game {
    public void run() {
        GameState gameState = new GameState();
        gameState.setup();
        while (true) {
            char inputLetter = GameActions.inputLetter();
            gameState.openLetter(inputLetter);
        }
    }
}
