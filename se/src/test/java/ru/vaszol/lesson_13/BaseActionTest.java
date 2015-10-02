package ru.vaszol.lesson_13;

import org.junit.Test;
import ru.vaszol.GameMiner.BaseAction;
import ru.vaszol.GameMiner.Cell;
import ru.vaszol.GameMiner.GeneratorBoard;
import ru.vaszol.GameMiner.console.ConsoleBoard;
import ru.vaszol.GameMiner.console.ConsoleCell;
import ru.vaszol.GameMiner.logics.Easy;

import static org.junit.Assert.*;
/**
 * Created by vas on 02.10.2015.
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
