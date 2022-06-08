package ru.GB.lesson_6;

public abstract class Animal {
// Создадим абстрактный класс, в котором все животные будут иметь имя и тип.
    protected String name;
    protected String type;

    public Animal(String name, String type) {
        this.name = name;
        this.type = type;
    }
// Каждое животное должно уметь плавать и бегать
    public abstract void swim(int range);
    public abstract void run (int range);

    public String getType() {
        return type;
    }
}
