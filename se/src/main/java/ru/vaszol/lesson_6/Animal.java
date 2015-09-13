package ru.vaszol.lesson_6;

/**
 * Created by vas on 13.09.2015.
 */
public class Animal implements Pet {
    private final String name;

    public Animal(final String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}