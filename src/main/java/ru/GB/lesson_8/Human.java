package ru.GB.lesson_8;

public class Human implements Sportable{
    private int maxDistance;
    private int maxHeight;
    private String name;
    private String type;

    public Human(int maxDistance, int maxHeight, String name) {
        this.maxDistance = maxDistance;
        this.maxHeight = maxHeight;
        this.name = name;
        this.type= "Человек";
    }

    @Override
    public int getMaxDistance() {
        return maxDistance;
    }

    @Override
    public int getMaxHeight() {
        return maxHeight;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getType() {
        return type;
    }

}
