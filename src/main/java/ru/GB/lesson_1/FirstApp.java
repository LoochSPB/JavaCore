package ru.GB.lesson_1;

public class FirstApp {
    public static void main(String[] args) {
        /*


        */

//        2. Создать переменные всех пройденных типов данных и инициализировать их значения.

        task2();

//       3. Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
//       где a, b, c, d – аргументы этого метода, имеющие тип float.

        task3Answer(10.2f, 4.7f, 5.3f, 88.2f);

//        4. Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит
//        в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.

        task4Answer(8, 3);

//        5. Написать метод, которому в качестве параметра передается целое число, метод должен
//        напечатать в консоль, положительное ли число передали или отрицательное. Замечание: ноль
//        считаем положительным числом.

        task5Answer(10);

//        6. Написать метод, которому в качестве параметра передается целое число. Метод должен
//        вернуть true, если число отрицательное, и вернуть false если положительное.

        task6Answer(-404);

//        7. Написать метод, которому в качестве параметра передается строка, обозначающая имя.
//        Метод должен вывести в консоль сообщение «Привет, указанное_имя!».

        task7Answer("Тимон");

//        8. *Написать метод, который определяет, является ли год високосным, и выводит сообщение в
//        консоль. Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й –
//        високосный.

        task8Answer (606);

    }

    private static void task8Answer(int i) {
        System.out.println("\nЗадание 8:");
        System.out.println("Написать метод, который определяет, является ли год високосным, и выводит сообщение в\n" +
                "консоль. Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й –\n" +
                "високосный.");
        System.out.print("Год " + i + " - ");
        yearCheck(i);


    }

    /**
     * Проверяет полученные параметры путем деления по модулю является ли год високосным, о чем сообщает в консоль.
     * @param i Год
     */
    private static void yearCheck(int i) {
        if ((i%4) ==0 && (i%100)!=0) System.out.println("Високосный");
        else if ((i%400) == 0) System.out.println("Високосный");
        else System.out.println("Не високосный");
    }

    private static void task7Answer(String name) {
        System.out.println("\nЗадание 7:");
        System.out.println("Написать метод, которому в качестве параметра передается строка, обозначающая имя.\n" +
                "Метод должен вывести в консоль сообщение «Привет, указанное_имя!»");
        System.out.println("Привет, " + name + "!");
    }

    private static void task6Answer(int i) {
        System.out.println("\nЗадание 6:");
        System.out.println("Написать метод, которому в качестве параметра передается целое число. Метод должен\n" +
                "вернуть true, если число отрицательное, и вернуть false если положительное.");
        System.out.printf("Результат проверки числа %d - " + isNegative(i) + "\n", i);
    }

    private static boolean isNegative(int i) {
        if (i < 0) return true;
        return false;
    }

    private static void task5Answer(int i) {
        System.out.println("\nЗадание 5:");
        System.out.println("Написать метод, которому в качестве параметра передается целое число, метод должен\n" +
                "напечатать в консоль, положительное ли число передали или отрицательное. Замечание: ноль\n" +
                "считаем положительным числом.");
        System.out.printf("Число %d - ", i);
        positiveCheck(i);
    }

    private static void positiveCheck(int i) {
        if (i < 0) System.out.println("Отрицательное");
        else System.out.println("Положительное");
    }

    /**
     * Метод описывает задание №4. Выводит в консоль само задание и пояснения. Также запускает саму проверку.
     *
     * @param a Значение 1 (целое число int)
     * @param b Значение 2 (целое число int)
     */
    private static void task4Answer(int a, int b) {
        System.out.println("\nЗадание 4:");
        System.out.println("Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит\n" +
                "в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.\n");
        System.out.printf("Первое значение %d, второе значение %d\n", a, b);
        System.out.println("Результат проверки - " + valueCheck(a, b));


    }

    /**
     * Метод проверяет сумму целых чисел на предмет нахождения в диапазоне от 10 до 20
     *
     * @param a Значение 1 (целое число int)
     * @param b Значение 2 (целое число int)
     * @return Результат проверки
     */
    private static boolean valueCheck(int a, int b) {
        if (a + b >= 10 && a + b <= 20) return true;
        return false;
    }

    /**
     * Метод описывает задание №3. Принимает параметры типа flaot для дальнейшей передачи их в метод для калькуляции.
     * Запускает саму калькуляцию.
     * @param a Число типа float
     * @param b Число типа float
     * @param c Число типа float
     * @param d Число типа float
     */
    private static void task3Answer(float a, float b, float c, float d) {
        System.out.println("\nЗадание 3: ");
        System.out.println("Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,\n" +
                "где a, b, c, d – аргументы этого метода, имеющие тип float.");
        System.out.printf("Ответ при a = %.2f, b = %.2f, c = %.2f, d = %.2f будет равен %.2f\n",
                a, b, c, d, task3(a, b, c, d));
    }

    /**
     * Метод создает переменные всех примитивных типов и информирует об этом в консоль.
     * А также выводит в консоль задание.
     */
    private static void task2() {
        System.out.println("Задание 2: ");
        System.out.println("Создать переменные всех пройденных типов данных и инициализировать их значения.");

        byte b;
        b = 12;
        System.out.println("Переменная типа byte создана, b = " + b);

        short s;
        s = 80;
        System.out.println("Переменная типа short создана, s = " + s);


        int i;
        i = 200;
        System.out.println("Переменная типа int создана, i = " + i);


        long l;
        l = 700L;
        System.out.println("Переменная типа long создана, l = " + l);


        double d;
        d = 50.3;
        System.out.println("Переменная типа double создана, d = " + d);


        float f;
        f = 483.8F;
        System.out.println("Переменная типа float создана, f = " + f);


        char c;
        c = '#';
        System.out.println("Переменная типа char создана, c = " + c);


        String word;
        word = "Hello!";
        System.out.println("Переменная типа String создана, word = " + word);

    }

    /**
     * Выполняет калькуляцию по формуле a * (b + (c / d))
     * @param a Число типа float
     * @param b Число типа float
     * @param c Число типа float
     * @param d Число типа float
     * @return Результат типа float
     */
    private static float task3(float a, float b, float c, float d) {
        return a * (b + (c / d));
    }
}
