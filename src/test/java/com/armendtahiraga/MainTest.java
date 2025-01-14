package com.armendtahiraga;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {
    @Test
    public void testAdd() {
        assertEquals(5.0, Main.add(2, 3), 0.001);
        assertEquals(-1.0, Main.add(2, -3), 0.001);
        assertEquals(0.0, Main.add(0, 0), 0.001);
    }

    @Test
    public void testSubtract() {
        assertEquals(-1.0, Main.subtract(2, 3), 0.001);
        assertEquals(5.0, Main.subtract(2, -3), 0.001);
        assertEquals(0.0, Main.subtract(0, 0), 0.001);
    }

    @Test
    public void testMultiply() {
        assertEquals(6.0, Main.multiply(2, 3), 0.001);
        assertEquals(-6.0, Main.multiply(2, -3), 0.001);
        assertEquals(0.0, Main.multiply(0, 3), 0.001);
    }

    @Test
    public void testDivide() {
        assertEquals(2.0 / 3.0, Main.divide(2, 3), 0.001);
        assertEquals(-2.0 / 3.0, Main.divide(2, -3), 0.001);
        assertEquals(Double.POSITIVE_INFINITY, Main.divide(2, 0), 0.001);
    }
}
