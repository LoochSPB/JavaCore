package ru.GB.lesson_7;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Plate plate = new Plate(100);  // Создадим тарелку с количеством еды 100
        boolean isFeed = false;              // Создадим переменную для проверки, все ли коты покормлены

        Random rand = new Random();          // Генератор случайных чисел для кошачьего аппетита
        int maxAppetite = 50;                // Максимальный кошачий аппетит
        Cat[] cats = new Cat[8];             // Массив котов
        cats[0] = new Cat("Barsik", rand.nextInt(maxAppetite));
        cats[1] = new Cat("Flash", rand.nextInt(maxAppetite));
        cats[2] = new Cat("Batman", rand.nextInt(maxAppetite));
        cats[3] = new Cat("Joker", rand.nextInt(maxAppetite));
        cats[4] = new Cat("Alfred", rand.nextInt(maxAppetite));
        cats[5] = new Cat("Harley Quinn", rand.nextInt(maxAppetite));
        cats[6] = new Cat("Catwoman", rand.nextInt(maxAppetite));
        cats[7] = new Cat("Two-face", rand.nextInt(maxAppetite));

        /*
        Покормим всех котов в массиве. Еды в тарелке кому-то может не хватить.
        Поэтому поставим все в цикл Do-while, до того пока все коты не будут
        покормлены. После прохождения итерации, тарелка будет наполнена едой
        на 100, при условии, что её недостаточно.
         */
        do {
            int counter = 0;
            for (Cat cat : cats) {
                System.out.println("-----------------------------------------");
                cat.info();
                cat.eat(plate);
                cat.info();
                if (cat.isSatiety()) {
                    counter = counter + 1;
                }
                if (counter >= 8) isFeed = true;
                System.out.println("-----------------------------------------");
            }
            plate.info();
            if (plate.getFood() <= 50) {
                plate.fillPlate(100);
                plate.info();
            }
        } while (!(isFeed));

    }


}
