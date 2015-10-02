package ru.vaszol.lesson_10;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import static org.junit.Assert.*;
/**
 * Created by vas on 02.10.2015.
 */
public class CollectionTest {
    @Test
    public void arrayContains() {
        List<User> users = new ArrayList<User>();
        users.add(new User("1", "first"));
        users.add(new User("2", "second"));

        assertTrue(users.contains(new User("1", "first")));
    }

    /**
     * ����������� {@link java.util.Set#add} �� ������� hashCode equals
     */
    @Test
    public void setAdd() {
        Set<User> users = new HashSet<User>();
        users.add(new User("1", "first"));
        users.add(new User("2", "second"));

        assertEquals(2, users.size());
    }

    /**
     * ����������� {@link java.util.Map#put} �� ������� hashCode equals
     */
    @Test
    public void mapPut() {
        Map<User, User> users = new HashMap<User, User>();
        users.put(new User("1", "first"), new User("1", "first"));
        users.put(new User("2", "second"), new User("2", "second"));
        users.put(new User("1", "first"), new User("3", "first"));

        assertEquals(2, users.size());
    }
}
