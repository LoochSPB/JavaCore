package ru.GB.lesson_6;

public class Homework {

    public static void main(String[] args) {

        // Создадим массив животных, в котором разместим кошек и собак.
        Animal [] animals = new Animal[6];
        animals[0] = new Cat("Unicorn");
        animals[1] = new Cat("Rino");
        animals[2] = new Cat("Max");
        animals[3] = new Cat("Undertaker");
        animals[4] = new Dog("Rex");
        animals[5] = new Dog("Polkan");

        // Пройдем по массиву и вызовем информацию об объекте, в зависимости кошка это или собака
        for (Animal animal : animals) {
            if (animal instanceof Cat) {
                ((Cat) animal).info();
            }
            if (animal instanceof Dog) {
                ((Dog) animal).info();
            }
            // Попросим животное пробежать и проплыть.
            animal.run(150);
            animal.run(350);
            animal.swim(10);
            animal.swim(50);
        }

        // Выведем информацию об общем количестве животных.
        System.out.println("Всего животных " + Counter.getCounter());
        System.out.println("Всего кошек " + Counter.getCatCounter());
        System.out.println("Всего собак " + Counter.getDogCounter());


    }

}
