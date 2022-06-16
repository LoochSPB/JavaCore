package ru.GB.lesson_8;

public interface Sportable {

    default public void info(){
        System.out.printf("%s %s\t Максимальная дистанция: %d\t Максимальная высота: %d\n",getType(),getName(),getMaxDistance(),getMaxHeight());
    }

     default void run (RunningTrack obstacles){
         if (obstacles.<Integer>obstacleCheck(getMaxDistance())) System.out.printf("%s %s пробежал дистанцию %d\n",getType(), getName(), obstacles.getDistance());
         else  System.out.printf("%s %s не пробежал дистанцию %d\n",getType(), getName(), obstacles.getDistance());
     }

    int getMaxDistance();

    default void jump (Wall obstacles){
        if (obstacles.<Double>obstacleCheck((double)getMaxHeight())) System.out.printf("%s %s перепрыгнул через стену %.2f\n",
                getType(), getName(), obstacles.getHeight());
        else System.out.printf("%s %s не перепрыгнул через стену %.2f\n",
                getType(), getName(), obstacles.getHeight());
     }

    int getMaxHeight();

    String getName();

    String getType();

}
