package ru.GB.lesson_6;

public class Counter {
// Класс, который считает количество обращений и возвращает в виде int.
    static int counter;
    static int dogCounter;
    static int catCounter;

    /**
     * Считает количество обращений в целом и по типам.
     */
    public static void count(String type) {
        if (type.equals("Кот")) catCounter = ++catCounter;
        if (type.equals("Собака")) dogCounter = ++dogCounter;
        counter = ++counter;
    }

    public static int getDogCounter() {
        return dogCounter;
    }

    public static int getCatCounter() {
        return catCounter;
    }

    /**
     * Возвращает текущее количество обращений
     * @return
     */
    public static int getCounter() {
        return counter;
    }




}
