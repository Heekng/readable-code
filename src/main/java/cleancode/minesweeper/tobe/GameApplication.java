package cleancode.minesweeper.tobe;

import cleancode.minesweeper.tobe.config.GameConfig;
import cleancode.minesweeper.tobe.gamelevel.Beginner;
import cleancode.minesweeper.tobe.io.ConsoleInputHandler;
import cleancode.minesweeper.tobe.io.ConsoleOutputHandler;

public class GameApplication {

    public static void main(String[] args) {
        GameConfig gameConfig =
                new GameConfig(new Beginner(), new ConsoleInputHandler(), new ConsoleOutputHandler());

        // 설정에 추가가 있을 때, 생성자가 변경되지 않게 포장하자.
        Minesweeper minesweeper = new Minesweeper(gameConfig);
        minesweeper.initialize();
        minesweeper.run();
    }

    /**
     * DIP (Dependency Inversion Principle)
     *
     * <p>DI (Dependency Injection) - "3"
     *
     * <p>IoC (Inversion of Control)
     */
}
