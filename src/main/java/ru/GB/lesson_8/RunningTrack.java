package ru.GB.lesson_8;

public class RunningTrack implements Obstacles {

    private int distance;

    public int getDistance() {
        return distance;
    }

    public RunningTrack(int distance) {
        this.distance = distance;
    }

    @Override
    public <T> boolean obstacleCheck(T sportmanAbilities) {
        return ((Integer) sportmanAbilities) >= getDistance();
    }


}
