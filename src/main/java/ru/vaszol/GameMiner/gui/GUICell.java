package ru.vaszol.GameMiner.gui;

import ru.vaszol.GameMiner.Cell;

import java.awt.*;

/**
 * Created by vas on 13.09.2015.
 */
public class GUICell implements Cell<Graphics> {

    public boolean isBomb() {
        return false;
    }

    public boolean isSuggestBomb() {
        return false;
    }

    public boolean isSuggestEmpty() {
        return false;
    }

    public void suggectEmpty() {
    }

    public void suggectBomb() {
    }

    public void draw(Graphics paint, boolean real) {

    }
}