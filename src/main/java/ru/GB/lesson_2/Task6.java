package ru.GB.lesson_2;

import java.util.Random;

public class Task6 {

    public static void main(String[] args) {

//        Выведем в консоль задание
        System.out.println(HomeworkTasks.task6);

//        Создадим массив и заполним его произвольными значениями
        int[] arr = new int[5];
        ArrayPrintAndFill.fillArray(arr, 10);

//        Выведем в консоль
        ArrayPrintAndFill.printArray(arr);

//        Выведем в консоль результат проверки
        System.out.println(checkBalance(arr));
    }

    /**
     * Метод проверяющий есть ли в массиве такое место, где сумма первой части значений массива будет равна сумме второй части значений
     *
     * @param arr Непустой массив целочисленных значений
     * @return Результат сравнения
     */
    private static boolean checkBalance(int[] arr) {


        if (arr.length == 0) {                              //Проверим массив пустой или нет
            System.out.println("Массив пустой");
            return false;
        } else {
            int leftSum = 0;
            int rightSum = 0;

            for (int i = 1; i < arr.length - 1; i++) {      //Пройдем по всему массиву
                for (int j = 0; j <= i; j++) {              //Просуммируем левую часть
                    leftSum += arr[j];
                }
                for (int j = i + 1; j < arr.length; j++) {  //Просуммируем правую часть
                    rightSum += arr[j];
                }
                if (leftSum == rightSum) return true;       //Проверка суммы
                else {
                    leftSum = 0;                            //Обнулим значения перед новой итерацией
                    rightSum = 0;
                }
            }

            return false;
        }

    }

}
