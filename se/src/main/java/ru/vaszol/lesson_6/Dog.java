package ru.vaszol.lesson_6;

/**
 * Created by vas on 13.09.2015.
 */
public class Dog implements Pet {
    private final Animal animal;

    public Dog(Animal animal) {
        this.animal = animal;
    }

    public String getName() {
        return this.animal.getName();
    }
}