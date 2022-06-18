package ru.GB.lesson_9;

public class ArrayException extends Exception{

    public ArrayException(String message) {
        super(message);
    }
}

class ArraySizeException extends ArrayException{

    public ArraySizeException() {
        super("Размер массива не совпадает с рабочим. Размер должен быть 4х4.");
    }
}

class ArrayDataException extends ArrayException {
    public ArrayDataException(int x, int y) {
        super(String.format("Данные в ячейке %d, %d не числа.",x,y));
    }
}

