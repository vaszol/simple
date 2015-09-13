package ru.vaszol.GameMiner.console;

import ru.vaszol.GameMiner.Cell;

import java.io.PrintStream;

/**
 * Created by vas on 07.09.2015.
 */
public class ConsoleCell implements Cell<PrintStream> {
    private boolean bomb;
    private boolean suggestBomb = false;
    private boolean suggestEmpty = false;

    public ConsoleCell(boolean bomb) {
        this.bomb = bomb;
    }

    @Override
    public boolean isBomb() {
        return this.bomb;
    }

    @Override
    public boolean isSuggestBomb() {
        return this.suggestBomb;
    }

    @Override
    public boolean isSuggestEmpty() {
        return this.suggestEmpty;
    }

    @Override
    public void suggectEmpty() {
        this.suggestEmpty = true;
    }

    @Override
    public void suggectBomb() {
        this.suggestBomb = true;
    }

    @Override
    public void draw(PrintStream paint, boolean real) {
        if (real) {
            if (this.isBomb()) {
                paint.print("[*] ");
            } else {
                paint.print("[ ] ");
            }
        } else {
            if (this.suggestBomb) {
                paint.print("[?] ");
            } else if (this.suggestEmpty) {
                paint.print("[ ] ");
            } else {
                paint.print("[Х] ");
            }
        }
    }
}