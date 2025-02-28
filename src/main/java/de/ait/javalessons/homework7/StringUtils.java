package de.ait.javalessons.homework7;

// Задание 4: Проверка длины строки
class StringUtils {
    public int getLength(String str) {
        return (str == null) ? 0 : str.length();
    }

    // Задание 5: Проверка, содержит ли строка определенное слово
        public boolean containsWord(String text, String word) {
            if (text == null || word == null) {
                return false;
            }
            return text.contains(word);
        }
    }

