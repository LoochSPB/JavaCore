package ru.GB.lesson_2;

import java.util.Random;

/**
 * Класс содержит полезные утилиты для заполнения и печати массива в консоли.
 */
public class ArrayPrintAndFill {

    /**
     * Метод для печати одномерного массива в консоли.
     *
     * @param arr Массив для печати.
     */
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) System.out.println(arr[i]);
            else System.out.print(arr[i] + ", ");
        }

    }

    /**
     * Метод для печати двумерного массива в консоли.
     *
     * @param arr Массив для печати.
     */
    public static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (j == arr[i].length - 1) System.out.println(arr[i][j]);
                else System.out.print(arr[i][j] + ", ");
            }
        }

    }

    /**
     * Метод заполняет массив произвольными значениями в необходимых пределах
     *
     * @param arr Массив для заполнения
     * @param n   Необходимая граница произвольных чисел
     */
    public static void fillArray(int[] arr, int n) {
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(n);
        }
    }
}



