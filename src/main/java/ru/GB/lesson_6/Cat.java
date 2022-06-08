package ru.GB.lesson_6;

public class Cat extends Animal {
    //    Создадим класс кошек.
    private int id;     // Порядковый номер животного

    public Cat(String name) {
        super(name, "Кот");         // Конструктор родителя Animal. Все коты имеют тип кот.
        Counter.count(type);                 // Считает количество созданных объектов
        this.id = Counter.getCounter();  // Присваивает порядковый номер
    }

    /**
     * Переопределенный метод. Сообщает о невозможности котам плавать,
     * в отличие от других Animal.
     *
     * @param range расстояние
     */
    @Override
    public void swim(int range) {
        System.out.println("Коты не умеют плавать!");
    }

    /**
     * Позволяет котам пробежать дистанцию, обращая внимание на возможности кошек
     *
     * @param range расстояние
     */
    @Override
    public void run(int range) {
        if (range > 0 && range <= 200)
            System.out.printf("Кот %s бежит %d.......\n", name, range);
        if (range > 200)
            System.out.printf("Кот %s не может бегать так далеко!\n", name);
    }

    /**
     * Выводит в консоль информацию об объекте
     */
    public void info() {
        System.out.printf("Животное №%d\t Тип %s\t Имя: %s\n", id, type, name);
    }
}
