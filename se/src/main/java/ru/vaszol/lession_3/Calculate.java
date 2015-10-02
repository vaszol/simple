package ru.vaszol.lession_3;

/**
 * Created by vas on 02.10.2015.
 */
public class Calculate {
    public static void main(String[] arg) {
        System.out.println("Calculate...");
        int first = Integer.valueOf(arg[0]);
        int second = Integer.valueOf(arg[1]);
        int sum = first + second;
        System.out.println("Sum : " + sum);
    }
}
