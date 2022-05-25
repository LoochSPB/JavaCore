package ru.GB.lesson_3;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Homework {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {


        System.out.print("Добрый день.\nВы попали в игровой зал.\n");

        while (true) {
            System.out.println("Выберите комнату и начните игру.");
            System.out.println("1 - Комната с игрой для подсчета суммы всех нечетных чисел.");
            System.out.println("2 - Комната с игрой \"Угадай число\".");
            System.out.println("3 - Комната с игрой \"Угадай слово\".");
            System.out.println("0 - Выход из зала.");
            System.out.print("Номер комнаты: ");


            if (scan.hasNextInt()) {

                switch (scan.nextInt()) {
                    case 0:
                        scan.nextLine();
                        System.out.println("Всего доброго!");
                        return;
                    case 1:
                        sumCalcNotEven();
                        break;
                    case 2:
                        guessTheNumber();
                        break;
                    case 3:
                        scan.nextLine();
                        guessTheWord();
                        break;
                    default:
                        scan.nextLine();
                        System.out.println("Введите корректное число, согласно номера комнаты.");
                        System.out.println();
                        break;
                }


            } else {
                System.out.println("Пожалуйста, введите именно число.");
                System.out.println();
                scan.nextLine();
                scan.nextLine();
            }


        }


    }

    private static void guessTheWord() {

        System.out.println();
        System.out.println("===================================================");
        System.out.println("Компьютер загадает слово, Ваша задача его отгадать.");

        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot",
                "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea",
                "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};

        Random rand = new Random();

//        Загадаем слово и объявим переменные

        String secretWord = words[rand.nextInt(words.length)];
        char[] secret = new char[15];          //Создадим массив в котором легко можно будет менять символы
        fillArr(secret);                        //Заполним массив
        String answerWord;

//        Дальше выведем на экран секрет и запросим слово у пользователя.
        System.out.print("\nИтак, слово загадано, вот оно:");
        arrayPrint(secret);
        System.out.println();
        while (true) {

            do {
                System.out.println("Как Вы думаете, что это за слово?");
                System.out.print("Ответ: ");
                answerWord = scan.nextLine();

//                Проверим строку, чтобы она содержала буквенные символы
                if (!(answerWord.isEmpty())) break;
                else System.out.println("Try again!");
            } while (answerWord.isEmpty());
            answerWord = answerWord.toLowerCase(Locale.ROOT);

//        Проверим слова на соответствие. И создадим механизм открывания букв.

            if (answerWord.equals(secretWord)) {
                System.out.println("Правильно, Вы победили!");
                break;
            }
            else {
                System.out.println("Неправильно, компьютер поможет. Откроем одну из букв в этом слове.");
                int charNumber = -1;
                do {
                    charNumber = rand.nextInt(secretWord.length());
                    if (secret[charNumber] == '#') {
                        secret[charNumber] = secretWord.charAt(charNumber);
                        arrayPrint(secret);
                        break;
                    }
                } while (!(secret[charNumber] == '#'));
            }
            if (endOfTheGameСheck(secretWord, secret)) {
                System.out.println("Игра закончена, к сожалению, Вы проиграли.");
                break;
            }
        }
    }

    private static boolean endOfTheGameСheck(String word, char[] arr) {
        String arrPerformed = "";
        ;
        for (int i = 0; i < arr.length; i++) {
            arrPerformed = arrPerformed + String.valueOf(arr[i]);
        }
        arrPerformed = arrPerformed.replaceAll("#", "");
        return word.equals(arrPerformed);
    }


    private static void arrayPrint(char[] secret) {
        for (int i = 0; i < secret.length; i++) {
            System.out.print(secret[i]);
        }
        System.out.println();
    }

    private static void fillArr(char[] secret) {
        for (int i = 0; i < secret.length; i++) {
            secret[i] = '#';
        }
    }

    private static void guessTheNumber() {

        System.out.println("-------------------------------------------------\nСыграем в игру угадай число.\n" +
                "Компьютер загадает число от 1 до 100, Ваша задача угадать это число.\nДля выхода нажмите 0.\n");
        while (true) {
            gameOfNumbers();
            int answer = -1;
            do {
                System.out.print("Хотите сыграть еще раз?\n1 если да, 0 если нет: ");
                answer = getPlayerNumber();
                if (answer == 0) {
                    System.out.println("Всего хорошего!\n");
                    return;
                }
                if (answer > 1) System.out.println("Вводите 1 или 0");

            } while (!(answer == 1));
        }


    }

    private static void gameOfNumbers() {
        Random rand = new Random();
        int secretNumber;
        int playerNumber = 0;

//        Создадим механизм загадывания числа

        secretNumber = rand.nextInt(101);

//        Сообщим пользователю, что число загадано.
        System.out.println("Число загадано.");


//        Создадим повторяющийся модуль для продолжения игры после проверки чисел и получения числа от пользователя
        while (true) {
            System.out.println("Пожалуйста введите число, которое по Вашему мнению загадал компьютер: ");
            playerNumber = getPlayerNumber();

//        Сопоставим числа
            if (playerNumber == 0) {
                System.out.println("Спасибо за игру!");
                break;
            }
            if (playerNumber > secretNumber) System.out.println("Загаданное число меньше");
            if (playerNumber < secretNumber) System.out.println("Загаданное число больше");
            if (playerNumber == secretNumber) {
                System.out.printf("Поздравляю, Вы победили. Загаданное число действительно %d.\n", secretNumber);
                break;
            }
        }
    }

    /**
     * Получает от пользователя целое число.
     *
     * @return Ответ пользователя
     */
    private static int getPlayerNumber() {
        int answer = -1;
        do {
//        Получим число от пользователя и проверим ввод на то, что это число.
          if (scan.hasNextInt()) {
                answer = scan.nextInt();
                scan.nextLine();
            } else {
              scan.nextLine();
              System.out.print("Введите пожалуйста именно число: ");
            }
        } while (!(answer >= 0));
        return answer;
    }


    private static void sumCalcNotEven() {
        int count = 1;
        int notEvenCount = 0;
        int sum = 0;
        int number = 0;
        boolean isNumber;
        System.out.println("\n----------------------------------------------------------------------------1");
        System.out.println("Итак, в этой комнате мы подсчитаем за Вами все нечетные числа и сложим их вместе");

        System.out.println("Начинайте вводить числа.");
        do {
            System.out.printf("Число %d: ", count);
            isNumber = scan.hasNextInt();

            if (isNumber) {
                number = scan.nextInt();
                scan.nextLine();
                if (number > 0 && isEven(number)) {
                    sum += number;
                    notEvenCount++;
                }

                count++;
            } else {
                System.out.println("Вводите, пожалуйста, числа.");
                scan.nextLine();

            }

        } while (!(isNumber && number == 0));

        System.out.printf("Сумма всех нечетных значений %d, всего было введено чисел %d, " +
                "из них нечетных %d.\n", sum, count, notEvenCount);
        System.out.println("Всего доброго!");
        System.out.println("=================================================================");
        System.out.println();


    }

    private static boolean isEven(int nextInt) {
        return nextInt % 2 == 0;
    }

}
