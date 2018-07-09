package ru.arsmagna.hello;

import org.junit.*;

import static org.junit.Assert.*;

public final class CalculatorTest {
    private Calculator calculator;

    @Before
    public final void setUp() {
        calculator = new Calculator();
    }

    @Test
    public final void add() {
        int actual = calculator.add(2, 3);
        int expected = 5;
        assertEquals(expected, actual);
    }

    @Test
    public final void subtract() {
        int actual = calculator.subtract(2, 3);
        int expected = -1;
        assertEquals(expected, actual);
    }

    @Test
    public final void multiply() {
        int actual = calculator.multiply(2, 3);
        int expected = 6;
        assertEquals(expected, actual);
    }

    @Test
    public final void divide() {
        int actual = calculator.divide(2, 3);
        int expected = 0;
        assertEquals(expected, actual);
    }
}