package ru.GB.lesson_9;


import java.util.Random;

public class Main {

    static Random rand = new Random();

    public static void main(String[] args) {

        String[][] digitArray = new String[4][4];

        fillArray(digitArray);
        digitArray[3][2] = "r";
        printArray(digitArray);
        try{
            System.out.println("Сумма всех значений массива "+arrayElementSum(digitArray));
        }catch (ArrayException e){
            System.out.println(e.getMessage());
        }

    }

    private static void printArray(String[][] digitArray) {
        for (int i = 0; i < digitArray.length; i++) {
            for (int j = 0; j < digitArray[i].length; j++) {
                if (j < 3) {
                    System.out.print(digitArray[i][j] + ", ");
                } else {
                    System.out.println(digitArray[i][j]);
                }
            }
        }
    }

    private static void fillArray(String[][] digitArray) {
        for (int i = 0; i < digitArray.length; i++) {
            for (int j = 0; j < digitArray[i].length; j++) {
                digitArray[i][j] = String.valueOf(rand.nextInt(50));
            }
        }
    }
//    TODO: Создать генератор массива в отдельном классе при помощи Random.

    static int arrayElementSum(String[][] arr) throws ArrayException {
        if (arr.length != 4) {
            throw new ArraySizeException();
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != 4) {
                throw new ArraySizeException();
            }
        }
        int exceptionX = 0;
        int exceptionY = 0;
        int sum = 0;

        try {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    exceptionX = i;
                    exceptionY = j;
                    sum += Integer.parseInt(arr[i][j]);
                }
            }
        } catch (NumberFormatException e) {
            throw new ArrayDataException(exceptionX, exceptionY);
        }
        return sum;
    }
}
