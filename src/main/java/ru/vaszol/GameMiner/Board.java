package ru.vaszol.GameMiner;

/**
 * Created by vas on 07.09.2015.
 */
public interface Board {

    /**
     * –исует доску исход€ из вход€щего массива €чеек
     * @param cells ћассив €чеек
     */
    void drawBoard(Cell[][] cells);

    /**
     * –исует €чейку
     * @param x позици€ по горизонтали
     * @param y позици€ по вертикали
     */
    void drawCell(int x, int y);

    /**
     * –исует взрыв всех бомб
     */
    void drawBang();

    /**
     * –исует поздравлени€ когда игра выиграна
     */
    void drawCongratulate();

}
