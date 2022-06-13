package ru.GB.lesson_7;

public class Cat {

    private String name;
    private int appetite;
    private boolean satiety;

    public boolean isSatiety() {
        return satiety;
    }

    public void setSatiety(boolean satiety) {
        this.satiety = satiety;
    }

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    /**
     * Покормить котов.
     * @param p тарелка с едой.
     */
    public void eat(Plate p) {
        if (satiety==false) { // Если кот не сыт, то он подойдет к тарелке
            if (p.getFood() < appetite) {                                       // Если еды в тарелке недостаточно
                System.out.printf("Коту %s не хватило еды в тарелке.\n", name); // Он не поест
                return;
            }
            p.decreaseFood(appetite);                       // Если еды хвататет
            System.out.printf("Кот %s поел.\n", name);      // Кот поест
            setSatiety(true);                               // Сытость станет true
        }
        else {
            System.out.printf("Кот %s не голоден.\n",name); // Если кот сыт, то он не будет есть и
        }                                                   // об этом будет сообщено.
    }

    /**
     * Информация об объекте
     */
    public void info() {
        System.out.printf("Кот: %s;\t Аппетит: %d;\t Сытость: %b\n",
                name, appetite, satiety);
    }

}
