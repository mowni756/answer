package com.example;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AppTest {
    @Test
    public void testTotal() {
        Student s = new Student("Test", 30, 20, 50);
        assertEquals(100.0, s.getTotal(), 0.01);
    }
}
