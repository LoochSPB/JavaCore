package ru.GB.lesson_7;

public class Plate {

    private int food;

    public Plate(int food) {
        this.food = food;
    }

    /**
     * Уменьшить количество еды в тарелке на меру аппетита объекта.
     * @param appetite мера аппетита.
     */
    public void decreaseFood (int appetite) {
        food -= appetite;
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    /**
     * Наполнить тарелку едой на указанное количество.
     * @param amountOfFood количество еды.
     */
    public void fillPlate (int amountOfFood) {
        setFood(getFood()+amountOfFood);
        System.out.println("Тарелка наполнена едой на "+amountOfFood);
    }

    public void info (){
        System.out.println("Количество еды в тарелке: " + food);
    }
}
