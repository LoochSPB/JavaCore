package ru.GB.lesson_2;

import java.util.Arrays;
import java.util.Random;

public class Task5 {
    public static void main(String[] args) {

//        Выведем в консоль задание
        System.out.println(HomeworkTasks.task5);

//        Создадим массив и заполним его произвольными значениями не более 100
        int[] arr = new int[10];
        ArrayPrintAndFill.fillArray(arr, 100);


//        Выведем в консоль массив

        ArrayPrintAndFill.printArray(arr);

//        Выведем в консоль максимальное и минимальное значение в массиве.
//        Воспользуемся методом из класса Arrays и приведем результат в тип int.
        System.out.println("Максимальное значение в массиве " + Arrays.stream(arr).max().getAsInt());
        System.out.println("Минимальное значение в массиве " + Arrays.stream(arr).min().getAsInt());

    }
}
