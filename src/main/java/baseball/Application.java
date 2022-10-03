package baseball;

import baseball.domain.GameState;
import baseball.controller.BaseBallGameController;

public class Application {

    public static void main(String[] args) {
        GameState gameState = GameState.START;

        while (gameState == GameState.START) {
            BaseBallGameController play = new BaseBallGameController();
            play.run();
        }
    }
}
