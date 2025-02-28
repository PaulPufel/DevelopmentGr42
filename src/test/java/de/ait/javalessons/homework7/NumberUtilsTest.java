package de.ait.javalessons.homework7;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

// Задание 2: Проверка чётности числа
public class NumberUtilsTest {
    private final NumberUtils numberUtils = new NumberUtils();

    @ParameterizedTest
    @ValueSource(ints = {2, 4, 6, 8, 10, -2, 0})
    void testIsEven_True(int number) {
        assertTrue(numberUtils.isEven(number));
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 3, 5, 7, 9, -1})
    void testIsEven_False(int number) {
        assertFalse(numberUtils.isEven(number));
    }
}
