package ru.vaszol.lesson_10;

import org.junit.Test;
import ru.vaszol.lesson_10.User;

import static org.junit.Assert.*;
/**
 * Created by vas on 02.10.2015.
 */
/**
 * ����������� equals = true �� hashCode = true
 * �������� ����������� �������������. hashCode = true �� equals ?
 */
public class UserTest {
    /**
     * x.equals(x)
     */
    @Test
    public void reflexive() {
        User pit = new User("1", "1");
        assertEquals(pit, pit);
    }

    /**
     * x.equals(y) y.equals(x)
     */
    @Test
    public void symmetric() {
        User pit = new User("1", "1");
        User dim = new User("1", "1");
        assertEquals(pit, dim);
        assertEquals(dim, pit);
    }

    /**
     * x.equals(y) y.equals(z) x.equals(z)
     */
    @Test
    public void transitive() {
        User pit = new User("1", "1");
        User dim = new User("1", "1");
        User max = new User("1", "1");
        assertEquals(pit, dim);
        assertEquals(dim, max);
        assertEquals(pit, max);
    }

    /**
     * multi y.equals(x) consistently
     */
    @Test
    public void consistent() {
        User pit = new User("1", "1");
        User dim = new User("1", "1");
        for (int i = 0; i != 10; ++i) {
            assertEquals(pit, dim);
        }
    }
}
