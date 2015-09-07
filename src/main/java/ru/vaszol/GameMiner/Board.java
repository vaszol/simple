package ru.vaszol.GameMiner;

/**
 * Created by vas on 07.09.2015.
 */
public interface Board {

    /**
     * ������ ����� ������ �� ��������� ������� �����
     * @param cells ������ �����
     */
    void drawBoard(Cell[][] cells);

    /**
     * ������ ������
     * @param x ������� �� �����������
     * @param y ������� �� ���������
     */
    void drawCell(int x, int y);

    /**
     * ������ ����� ���� ����
     */
    void drawBang();

    /**
     * ������ ������������ ����� ���� ��������
     */
    void drawCongratulate();

}
