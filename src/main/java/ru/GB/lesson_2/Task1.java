package ru.GB.lesson_2;

public class Task1 {
    public static void main(String[] args) {

//        Сперва выведем в консоль задание.
        System.out.println(HomeworkTasks.task1);

        System.out.println("Решение:");

//        Создадим массив с необходимыми значениями и выведем его в консоль при помощи метода,
//        созданного в специальном классе для печати массивов.
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        ArrayPrintAndFill.printArray(arr);

//        Создадим цикл, проверим все элементы на соответствие условию и заменим значения.
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) arr[i] = 1;

            else if (arr[i] == 1) arr[i] = 0;

            else return;
        }
//        Распечатаем, что получилось
        ArrayPrintAndFill.printArray(arr);

    }
}
