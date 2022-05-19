package ru.GB.lesson_2;

public class Task3 {

    public static void main(String[] args) {

//        Сперва выведем в консоль задание.
        System.out.println(HomeworkTasks.task3);
        System.out.println();
        System.out.println("Решение:");

//        Создадим массив с необходимыми значениями и выведем его в консоль при помощи метода,
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        ArrayPrintAndFill.printArray(arr);

//        Создадим цикл, проверим все элементы на соответствие условию и умножим значения.
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) arr[i] = arr[i] * 2;
        }

//        Выведем в консоль, что получилось
        ArrayPrintAndFill.printArray(arr);
    }

}
