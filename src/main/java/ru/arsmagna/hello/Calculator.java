package ru.arsmagna.hello;

import org.jetbrains.annotations.Contract;

/**
 * Sample class that can add, subtract, multiply, and divide integers.
 */
@SuppressWarnings("WeakerAccess")
public final class Calculator {
    /**
     * Addition of two integers.
     *
     * @param first  The first term.
     * @param second The second term.
     * @return Sum.
     */
    @Contract(pure = true)
    public int add(final int first, final int second) {
        return first + second;
    }

    /**
     * Subtraction of integers.
     *
     * @param first  Minuend.
     * @param second Subtrahend.
     * @return Difference.
     */
    @Contract(pure = true)
    public int subtract(final int first, final int second) {
        return first - second;
    }

    /**
     * Multiplication of two integers.
     *
     * @param first  The first factor.
     * @param second The second factor.
     * @return Product.
     */
    @Contract(pure = true)
    public int multiply(final int first, final int second) {
        return first * second;
    }

    /**
     * Division of integers.
     *
     * @param first  Dividend.
     * @param second Divisor.
     * @return Quotient.
     */
    @Contract(pure = true)
    public int divide(final int first, final int second) {
        return first / second;
    }
}
