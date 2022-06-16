package ru.GB.lesson_8;

public class Robot implements Sportable {
    private int maxDistance;
    private int maxHeight;
    private String name;
    private String type;

    public Robot(int maxDistance, int maxHeight, String name) {
        this.maxDistance = maxDistance;
        this.maxHeight = maxHeight;
        this.name = name;
        this.type= "Робот";

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
