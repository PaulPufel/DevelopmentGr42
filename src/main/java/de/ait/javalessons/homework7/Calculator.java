package de.ait.javalessons.homework7;

// Задание 1: Тестирование метода сложения
class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    // Задание 3: Проверка корректности работы деления
    public double divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return (double) a / b;
    }
  }
