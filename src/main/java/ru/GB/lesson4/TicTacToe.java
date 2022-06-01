package ru.GB.lesson4;

import java.util.Random;
import java.util.Scanner;

public class TicTacToe {

    static final char DOT_HUMAN = 'X'; // Фишка игрока - человек
    static final char DOT_AI = '0'; // Фишка игрока - компьютер
    static final char DOT_EMPTY = '•'; // Признак пустого поля
    static final Scanner scanner = new Scanner(System.in); // Вспомогательный класс для ввода данных
    static final Random random = new Random(); // Вспомогательный класс для генерации случайных чисел
    static char[][] field; // Двумерный массив, хранит текущее состояние игрового поля
    static int fieldSizeX; // Размерность игрового поля
    static int fieldSizeY; // размерность игрового поля
    static int winCount = 4;

    // Станислав, очень хочу доделать до конца, но больше тянуть не могу. Сдаю работу как есть.
    // Все алгоритмы выполнены. К этому вопросу вернусь позже, сейчас хочется уже идти дальше.

//    TODO: 1. Сделать игровое меню
//          2. В игровом меню сделать выбор: начать игру с компьютером, игру с игроком или настройка
//          3. В настройках сделать выбор размера поля и количества побед
//          4. Сделать вариант игры с другим игроком Hot Seat
//          5. Сделать проверки на ввод


    /**
     * Инициализация объектов игры
     */
    private static void initialize() {
        // Установим размерность игрового поля
        fieldSizeX = 5;
        fieldSizeY = 5;
        field = new char[fieldSizeX][fieldSizeY];
        for (int x = 0; x < fieldSizeX; x++) {
            for (int y = 0; y < fieldSizeY; y++) {
                // Проинициализируем все элементы массива DOT_EMPTY
                field[x][y] = DOT_EMPTY;
            }
        }
    }

    /**
     * Отрисовка игрового поля
     */
    static void printField() {

        System.out.print("+");
        for (int i = 0; i < fieldSizeX * 2 + 1; i++) {
            System.out.print(i % 2 == 0 ? "-" : i / 2 + 1);
        }
        System.out.println();

        for (int x = 0; x < fieldSizeX; x++) {
            System.out.print(x + 1 + "|");
            for (int y = 0; y < fieldSizeY; y++) {
                System.out.print(field[x][y] + "|");
            }
            System.out.println();
        }

        for (int i = 0; i <= fieldSizeX * 2 + 1; i++) {
            System.out.print("-");
        }
        System.out.println();
    }

    /**
     * Обработка хода игрока (человек)
     */
    static void humanTurn() {
        int x, y;

        do {
            System.out.print("Введите координаты хода X и Y\n(от 1 до 3) через пробел >>> ");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;

        } while (!(isCellValid(x, y) && isCellEmpty(x, y)));
        field[x][y] = DOT_HUMAN;
    }

    /**
     * Обработка хода игрока (компьютер)
     */
    static void aiTurn() {
        int x, y;

        for (int i = 0; i < fieldSizeX; i++) {
            for (int j = 0; j < fieldSizeY; j++) {
                if (humanWinCheck(i, j)) {
                    field[i][j] = DOT_AI;
                    return;
                }
            }
        }

        do {
            x = random.nextInt(fieldSizeX);
            y = random.nextInt(fieldSizeY);
        } while (!isCellEmpty(x, y));
        field[x][y] = DOT_AI;
    }

    private static boolean humanWinCheck(int x, int y) {
        if (isCellEmpty(x, y)) {
            field[x][y] = DOT_HUMAN;
            if (checkWin(DOT_HUMAN, winCount)) {
                field[x][y] = DOT_EMPTY;
                return true;
            }
            field[x][y] = DOT_EMPTY;
        }
        return false;
    }

    /**
     * Проверка, ячейка является пустой (DOT_EMPTY)
     *
     * @param x
     * @param y
     * @return
     */
    static boolean isCellEmpty(int x, int y) {
        return field[x][y] == DOT_EMPTY;
    }

    /**
     * Проверка корректности ввода (координаты хода не должны превышать размерность
     * массива, описывающего игровое поле)
     *
     * @param x
     * @param y
     * @return
     */
    static boolean isCellValid(int x, int y) {
        return x >= 0 && x < fieldSizeX && y >= 0 && y < fieldSizeY;
    }

    static boolean checkWin(char dot, int winCount) {
        for (int x = 0; x < fieldSizeX; x++) {
            for (int y = 0; y < fieldSizeY; y++) {
                if (field[x][y] == dot) {
                    if (checkXY(x, y, dot, winCount)) return true;
                }
            }
        }
        return false;
    }


    /**
     * Проверка на ничью (все поле заполнено фишками игрока или компьютера)
     *
     * @return
     */
    static boolean checkDraw() {
        for (int x = 0; x < fieldSizeX; x++) {
            for (int y = 0; y < fieldSizeY; y++) {
                if (isCellEmpty(x, y)) return false;
            }
        }
        return true;
    }

    /**
     * Метод проверки состояния игры
     *
     * @param dot - игровая фишка
     * @param s   - победный слоган
     * @return
     */
    static boolean gameChecks(char dot, String s) {

        if (checkWin(dot, winCount)) {
            System.out.println(s);
            return true; // завершение игры
        }
        if (checkDraw()) {
            System.out.println("Ничья!");
            return true; // завершение игры
        }
        // продолжаем игру
        return false;
    }

    public static void main(String[] args) {
        while (true) {
            initialize();
            printField();
            while (true) {
                humanTurn(); // Обработка хода игрока (человек)
                printField();
                if (gameChecks(DOT_HUMAN, "Вы победили!")) break;
                aiTurn(); // Обработка хода игрока (компьютер)
                printField();
                if (gameChecks(DOT_AI, "Победил компьютер!")) break;
            }
            System.out.print("Желаете сыграть еще раз? (Y - да)");
            if (!scanner.next().equalsIgnoreCase("Y")) break;
        }
    }


    static boolean checkXY(int x, int y, char c, int win) {
        if (       isHorizontalWin(x, y, c, win)
                || isVerticalWin(x, y, c, win)
                || isDiagonalUpWin(x, y, c, win)
                || isDiagonalDownWin(x, y, c, win)
        ) return true;


        else return false;
    }


    /**
     * Метод проверяет на победу по горизонтали
     *
     * @param x   Координаты стартовой точки по Х
     * @param y   Координаты стартовой точки по Y
     * @param c   Фишка игрока (Х или О)
     * @param win Необходимое число фишек в ряд
     * @return
     */
    private static boolean isHorizontalWin(int x, int y, char c, int win) {
        int count = 0;                              //Счетчик одинаковых фишек
        for (int i = y; i < y + win; i++) {
            if (i >= fieldSizeY) return false;      // Проверка на превышение длины массива
            if (field[x][i] == c) count++;          // Накрутка счетчика
            if (count == win) return true;          // Проверка количества фишек в ряд
        }
        count = 0;                                  // Обнулим счетчик
        return false;                               // Если необходимого количества фишек в ряд нет
    }

    /**
     * Метод проверяет на победу по вертикали
     *
     * @param x   Координаты стартовой точки по Х
     * @param y   Координаты стартовой точки по Y
     * @param c   Фишка игрока (Х или О)
     * @param win Необходимое число фишек в ряд
     * @return
     */
    private static boolean isVerticalWin(int x, int y, char c, int win) {
        int count = 0;                              //Счетчик одинаковых фишек
        for (int i = x; i < x + win; i++) {
            if (i >= fieldSizeX) return false;      // Проверка на превышение длины массива
            if (field[i][y] == c) count++;          // Накрутка счетчика
            if (count == win) return true;          // Проверка количества фишек в ряд
        }
        count = 0;                                  // Обнулим счетчик
        return false;                               // Если необходимого количества фишек в ряд нет
    }

    /**
     * Метод проверяет на победу по диагонали наверх
     *
     * @param x   Координаты стартовой точки по Х
     * @param y   Координаты стартовой точки по Y
     * @param c   Фишка игрока (Х или О)
     * @param win Необходимое число фишек в ряд
     * @return
     */
    private static boolean isDiagonalUpWin(int x, int y, char c, int win) {
        int count = 0;                              //Счетчик одинаковых фишек
        int temp = y;                               //Временная переменная, хранящая в себе следующий j
        for (int i = x; i > x - win; i--) {
            for (int j = temp; j < j + win; j++) {
                if (i >= fieldSizeX || j >= fieldSizeY
                        || i < 0) return false;         // Проверка на превышение длины массива
                if (field[i][j] == c) count++;          // Накрутка счетчика
                if (count == win) return true;          // Проверка количества фишек в ряд
                temp = j + 1;
                break;
            }
        }
        count = 0;                                  // Обнулим счетчик
        return false;                               // Если необходимого количества фишек в ряд нет
    }
    /**
     * Метод проверяет на победу по диагонали вниз
     *
     * @param x   Координаты стартовой точки по Х
     * @param y   Координаты стартовой точки по Y
     * @param c   Фишка игрока (Х или О)
     * @param win Необходимое число фишек в ряд
     * @return
     */
    private static boolean isDiagonalDownWin(int x, int y, char c, int win) {
        int count = 0;                              //Счетчик одинаковых фишек
        int temp = y;                               //Временная переменная, хранящая в себе следующий j
        for (int i = x; i < x + win; i++) {
            for (int j = temp; j < j + win; j++) {
                if (i >= fieldSizeX || j >= fieldSizeY)
                    return false;                       // Проверка на превышение длины массива
                if (field[i][j] == c) count++;          // Накрутка счетчика
                if (count == win) return true;          // Проверка количества фишек в ряд
                temp = j + 1;
                break;
            }
        }
        count = 0;                                  // Обнулим счетчик
        return false;                               // Если необходимого количества фишек в ряд нет
    }


}
