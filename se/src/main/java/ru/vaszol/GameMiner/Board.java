package ru.vaszol.GameMiner;

/**
 * Created by vas on 07.09.2015.
 */
public interface Board {

    /**
     * Рисует доску исходя из входящего массива ячеек.
     * @param cells Массив ячеек.
     */
    void drawBoard(Cell[][] cells);

    /**
     * Рисует ячеейку.
     * @param x позиция по горизонтали.
     * @param y позиция по вертикали.
     */
    void drawCell(int x, int y);

    /**
     * Рисует взрыв всех бомб.
     */
    void drawBang();

    /**
     * Рисует подзравления когда игра выграна.
     */
    void drawCongratulate();
}