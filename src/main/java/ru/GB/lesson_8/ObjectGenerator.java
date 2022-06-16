package ru.GB.lesson_8;

import java.util.Random;

public class ObjectGenerator {

    private static final String[] robotNames = {"Фиксик", "Доби", "Нафаня", "Вжик"};
    private static final String[] catNames = {"Цунами", "Забияка", "Матильда", "Кнопка"};
    private static final String[] humanNames = {"Александр", "Михаил", "Максим", "Иван"};

    static Random rand = new Random();

    public static Sportable sportableGenerator() {
        int objectType = rand.nextInt(3);

        switch (objectType) {
            case 0:
                return new Robot(rand.nextInt((500 - 400) + 400), rand.nextInt((10 - 5) + 5), robotNames[rand.nextInt(4)]);
            case 1:
                return new Cat(rand.nextInt((100 - 20) + 20), rand.nextInt((5 - 1) + 1), catNames[rand.nextInt(4)]);
            case 2:
                return new Human(rand.nextInt((300 - 200) + 200), rand.nextInt((3 - 1) + 1), humanNames[rand.nextInt(4)]);
        }
        return null;
    }

    public static Obstacles obstaclesGenerator() {
        int objectType = rand.nextInt(2);

        switch (rand.nextInt(2)) {
            case 0:
                return new RunningTrack(rand.nextInt((500 - 50) + 50));
            case 1:
                return new Wall(rand.nextDouble() * 10);
        }
        return null;
    }

}
