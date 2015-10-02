package ru.vaszol.lesson_4;

import ru.vaszol.lesson_8.UserException;
/**
 * Created by vas on 02.10.2015.
 */
/**
 * ����� ��������� �����������.
 */
public class Calculator {
    /**
     ��������� ����������.
     */
    private int result;

    /**
     * ��������� ���������.
     * @param params ��������� ������������.
     */
    public void add(int ... params) {
        for (int param : params) {
            this.result += param;
        }
    }

    /**
     * �������� �������.
     * @param args �������� ���������.
     * @throws ru.vaszol.lesson_8.UserException ���� ���������� ���, ���������� ����������.
     */
    public void div(int ... args) throws UserException {
        if (args.length > 0) {
            this.result = args[0];
            for (int params : args) {
                if (params == 0) {
                    throw new IllegalArgumentException("You try to div by 0. Please change arg!");
                }
                this.result /= params;
            }
        } else {
            throw new UserException("You should enter args!");
        }
    }

    /**
     * �������� ���������.
     * @return ��������� ����������.
     */
    public int getResult() {
        return this.result;
    }

    /**
     * �������� ��������� ����������.
     */
    public void cleanResult() {
        this.result = 0;
    }
}
