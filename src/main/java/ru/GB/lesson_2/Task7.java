package ru.GB.lesson_2;

public class Task7 {

    public static void main(String[] args) {

//        Выведем в консоль задание
        System.out.println(HomeworkTasks.task7);

//        Создадим массив и заполним его значениями.
        int[] arr = new int[8];
        ArrayPrintAndFill.fillArray(arr, 10);

//        Создадим переменную содержащую информацию о шаге смещения.
        int n = 2;

        System.out.println("Массив: ");
        ArrayPrintAndFill.printArray(arr);  //Выведем изначальный массив в консоль

        System.out.println("Сместить значения массива на " + n + " ячеек");

        arrayShift(arr, n);                 //Используем метод для смещения.
        System.out.println("Массив после смещения");
        ArrayPrintAndFill.printArray(arr);  //Смотрим результат

    }

    /**
     * Метод осуществляющий смещение элементов массива с указанным шагом.
     *
     * @param arr Массив, над которым проводим операцию
     * @param n   Шаг смещения
     */
    private static void arrayShift(int[] arr, int n) {
        int[] temp = new int[arr.length];          // Массив с временными данными

        for (int i = 0; i < arr.length; i++) {      // Цикл, копирующий значения во временный массив
            temp[i] = arr[i];
        }

        for (int i = 0; i < arr.length; i++) {      // Начинаем смещение
            if (i - n >= arr.length) {                // Позволяет перейти через верхнюю границу массива
                arr[i] = temp[i - n - arr.length];
            } else if (i - n < 0) {                  // Позволяет перейти через нижнюю границу массива
                arr[i] = temp[i - n + arr.length];
            } else arr[i] = temp[i - n];                // Осуществляет смещение.
        }
    }
}
