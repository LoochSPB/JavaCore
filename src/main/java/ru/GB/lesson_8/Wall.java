package ru.GB.lesson_8;

public class Wall implements Obstacles {
    private double height;

    public double getHeight() {
        return height;
    }

    public Wall(double height) {
        this.height = height;
    }

    @Override
    public <T> boolean obstacleCheck(T sportmanAbilities) {
        return (Double)sportmanAbilities>=getHeight();
    }


}


