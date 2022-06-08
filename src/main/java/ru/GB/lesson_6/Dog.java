package ru.GB.lesson_6;


public class Dog extends Animal {
    private int id;


    public Dog(String name) {
        super(name, "Собака");          // Конструктор родителя Animal. Все собаки имеют тип собака
        Counter.count(type);                     // Вызвать счетчик для подсчета созданных животных
        this.id = Counter.getCounter();      // Присвоим порядковый номер собаке
    }
    /**
     * Позволяет собакам проплыть дистанцию, обращая внимание на возможности собак
     *
     * @param range расстояние
     */
    @Override
    public void swim(int range) {
        if (range > 0 && range <= 10)
            System.out.printf("%s %s плывет %d.......\n",type, name, range);
        if (range > 10)
            System.out.printf("%s %s не может плыть так далеко!\n", type, name);

    }
    /**
     * Позволяет собакам пробежать дистанцию, обращая внимание на возможности собак
     *
     * @param range расстояние
     */
    @Override
    public void run(int range) {
        if (range > 0 && range <= 500)
            System.out.printf("%s %s бежит %d.......\n",type, name, range);
        if (range > 500)
            System.out.printf("%s %s не может бегать так далеко!\n", type, name);
    }
    /**
     * Выводит в консоль информацию об объекте
     */

    public void info() {
        System.out.printf("Животное №%d\t Тип %s\t Имя: %s\n", id, type, name);
    }
}



