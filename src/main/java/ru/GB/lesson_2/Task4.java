package ru.GB.lesson_2;

public class Task4 {

    public static void main(String[] args) {

//        Выведем в косноль задание
        System.out.println(HomeworkTasks.task4);

        System.out.println("Решение:");

//        Создадим массив
        int[][] arr = new int[5][5];

//        Выведем в консоль значения по умолчанию
        ArrayPrintAndFill.printArray(arr);
        System.out.println();

//        Заполним при помощи цикла
        for (int i = 0; i < arr.length; i++) {
            arr[i][i] = 1;
            arr[i][(arr.length - 1) - i] = 1;
        }

//        Посмотрим, что получилось
        ArrayPrintAndFill.printArray(arr);
    }
}
