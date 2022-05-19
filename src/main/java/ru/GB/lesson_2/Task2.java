package ru.GB.lesson_2;

public class Task2 {
    public static void main(String[] args) {

//        Сперва выведем в консоль задание.
        System.out.println(HomeworkTasks.task2);

        System.out.println("Решение:");
//        Создадим пустой int массив.

        int[] arr = new int[8];

//        Заполним массив, начиная с 1, т.к. в ячейке 0 по умолчанию 0.

        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i - 1] + 3;
        }

//        Выведем в консоль массив.
        ArrayPrintAndFill.printArray(arr);


    }

}
