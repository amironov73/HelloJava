package ru.arsmagna.hello;

import org.jetbrains.annotations.*;

/**
 * Класс, который умеет складывать, вычитать, умножать и делить целые числа.
 */
public final class Calculator
{
    /**
     * Сложение целых чисел.
     *
     * @param first  Первое слагаемое.
     * @param second Второе слагаемое.
     * @return Сумма.
     */
    @Contract(pure = true)
    public int add(int first, int second)
    {
        return first + second;
    }

    /**
     * Вычитание целых чисел.
     *
     * @param first  Уменьшаемое.
     * @param second Вычитаемое.
     * @return Разность.
     */
    @Contract(pure = true)
    public int subtract(int first, int second)
    {
        return first - second;
    }

    /**
     * Умножение целых чисел.
     *
     * @param first  Первый множитель.
     * @param second Второй множитель.
     * @return Произведение.
     */
    @Contract(pure = true)
    public int multiply(int first, int second)
    {
        return first * second;
    }

    /**
     * Деление целых чисел.
     *
     * @param first  Делимое.
     * @param second Делитель.
     * @return Частное.
     */
    @Contract(pure = true)
    public int divide(int first, int second)
    {
        return first / second;
    }
}
