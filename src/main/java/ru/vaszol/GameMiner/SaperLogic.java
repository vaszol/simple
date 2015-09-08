package ru.vaszol.GameMiner;

/**
 * Created by vas on 07.09.2015.
 */
public interface SaperLogic {

    void loadBoard(Cell[][] cells);

    boolean shouldBang(int x, int y);

    boolean finish();

    void suggest(int x, int y,  boolean bomb);
}
