package ru.GB.lesson_8;

public class Main {

    public static void main(String[] args) {
        Sportable[] pretenders = new Sportable[12];
        for (int i = 0; i < pretenders.length; i++) {
            pretenders[i] = ObjectGenerator.sportableGenerator();
        }
        Obstacles[] obstacles = new Obstacles[10];
        for (int i = 0; i < obstacles.length; i++) {
            obstacles[i] = ObjectGenerator.obstaclesGenerator();
        }


        for (Sportable pretender : pretenders) {
            System.out.println("-------------------------------------");
            pretender.info();
            for (int i = 0; i < obstacles.length; i++) {
                if (obstacles[i] instanceof Wall) pretender.jump((Wall) obstacles[i]);
                if (obstacles[i] instanceof RunningTrack) pretender.run((RunningTrack) obstacles[i]);
            }
            System.out.println("-------------------------------------");
        }

    }

}
