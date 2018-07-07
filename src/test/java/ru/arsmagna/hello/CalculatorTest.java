package ru.arsmagna.hello;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest
{
    Calculator calculator;

    @BeforeEach
    void setUp()
    {
        Calculator calculator = new Calculator();
    }

    @Test
    void add()
    {
        int actual = calculator.add(2, 3);
        int expected = 5;
        assertEquals(expected, actual);
    }

    @Test
    void subtract()
    {
        int actual = calculator.subtract(2, 3);
        int expected = -1;
        assertEquals(expected, actual);
    }

    @Test
    void multiply()
    {
        int actual = calculator.multiply(2, 3);
        int expected = 6;
        assertEquals(expected, actual);
    }

    @Test
    void divide()
    {
        int actual = calculator.divide(2, 3);
        int expected = 0;
        assertEquals(expected, actual);
    }
}