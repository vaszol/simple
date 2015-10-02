package ru.vaszol.lesson_10;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by vas on 02.10.2015.
 */
public class UserRunner {
    public static void main(String[] args) {
        Map<String, User> users = new HashMap<String, User>();
        users.put("1", new User("1", "first"));
        users.put("2", new User("2", "two"));
        users.put("1", new User("1", "first"));

        for (Map.Entry<String, User> user : users.entrySet()) {
            System.out.println(user);
        }
    }
}
