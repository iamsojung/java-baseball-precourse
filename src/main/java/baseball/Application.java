package baseball;

import baseball.domain.GameState;
import baseball.model.GamePlay;

public class Application {

    public static void main(String[] args) {
        GameState gameState = GameState.START;

        while (gameState == GameState.START) {
            GamePlay play = new GamePlay();
            play.run();
        }
    }
}
