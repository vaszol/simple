package ru.vaszol.GameMiner;

import org.junit.Test;
import ru.vaszol.GameMiner.console.ConsoleBoard;
import ru.vaszol.GameMiner.console.ConsoleCell;
import ru.vaszol.GameMiner.logics.Easy;

/**
 * Created by vas on 13.09.2015.
 */
public class BaseActionTest {

    final BaseAction action = new BaseAction(
            new Easy(), new ConsoleBoard(),
            new GeneratorBoard() {
                @Override
                public Cell[][] generate() {
                    return new Cell[][] {
                            {new ConsoleCell(true), new ConsoleCell(false)},
                            {new ConsoleCell(true), new ConsoleCell(false)}};
                }
            }
    );

    @Test
    public void successGame() {
        action.initGame();
        action.select(0, 0, true);
        action.select(1, 0, true);
        action.select(0, 1, false);
        action.select(1, 1, false);
    }

    @Test
    public void failureGame() {
        action.initGame();
        action.select(0, 0, true);
        action.select(1, 0, false);
    }
}