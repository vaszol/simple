package ru.vaszol.GameMiner;

/**
 * Created by vas on 07.09.2015.
 */
public interface Cell<T> {

    boolean isBomb();

    boolean isSuggestBomb();

    boolean isSuggestEmpty();

    void suggestEmpty();

    void suggestBomb();

    void draw(T paint, boolean real);
}
