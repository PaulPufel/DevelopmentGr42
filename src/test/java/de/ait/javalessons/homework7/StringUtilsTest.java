package de.ait.javalessons.homework7;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

// Задание 4: Проверка длины строки
public class StringUtilsTest {
    private final StringUtils stringUtils = new StringUtils();

    @ParameterizedTest
    @CsvSource({
            "hello, 5",
            "JUnit, 5",
            " , 0",
            "'abcdef', 6",
            "'a', 1",
            "'', 0",
            "null, 4"
    })
    void testGetLength(String input, int expected) {
        assertEquals(expected, stringUtils.getLength(input));
    }

// Задание 5: Проверка, содержит ли строка определенное слово
    @ParameterizedTest
    @CsvSource({
            "hello world, world, true",
            "JUnit testing, test, true",
            "parameterized tests, example, false",
            "case insensitive, CASE, false",
            "null, test, false",
            "hello, null, false"
    })
    void testContainsWord(String text, String word, boolean expected) {
        assertEquals(expected, stringUtils.containsWord(text, word));
    }
}

