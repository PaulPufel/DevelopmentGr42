package de.ait.javalessons.homework7;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

// Задание 1: Тестирование метода сложения
public class CalculatorTest {
    private final Calculator calculator = new Calculator();

    @ParameterizedTest
    @CsvSource({
            "1, 1, 2",
            "2, 3, 5",
            "-1, -1, -2",
            "-1, 1, 0",
            "0, 0, 0"
    })
    void testAdd(int a, int b, int expected) {
        assertEquals(expected, calculator.add(a, b));
    }

    // Задание 3: Проверка корректности работы деления
    @ParameterizedTest
    @CsvSource({
            "10, 2, 5.0",
            "9, 3, 3.0",
            "7, 2, 3.5",
            "-6, 3, -2.0",
            "0, 1, 0.0"
    })
    void testDivide(int a, int b, double expected) {
        assertEquals(expected, calculator.divide(a, b), 0.0001);
    }

    @ParameterizedTest
    @CsvSource({"10, 0", "-5, 0", "0, 0"})
    void testDivideByZero(int a, int b) {
        assertThrows(ArithmeticException.class, () -> calculator.divide(a, b));
    }
  }

