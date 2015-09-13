package ru.vaszol.GameMiner.gui;

import ru.vaszol.GameMiner.Cell;

import java.awt.*;

/**
 * Created by vas on 13.09.2015.
 */
public class GUICell implements Cell<Graphics> {
    @Override
    public boolean isBomb() {
        return false;
    }

    @Override
    public boolean isSuggestBomb() {
        return false;
    }

    @Override
    public boolean isSuggestEmpty() {
        return false;
    }

    @Override
    public void suggestEmpty() {

    }

    @Override
    public void suggestBomb() {

    }

    @Override
    public void draw(Graphics paint, boolean real) {

    }
}
