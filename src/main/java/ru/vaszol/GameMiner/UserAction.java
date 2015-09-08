package ru.vaszol.GameMiner;

/**
 * Created by vas on 07.09.2015.
 */
public interface UserAction {

    void initGame();

    void select(int x, int y, boolean bomb);
}
