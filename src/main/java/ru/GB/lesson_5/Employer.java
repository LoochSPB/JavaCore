package ru.GB.lesson_5;

public class Employer {
    // Класс для создания объекта типа работник
// Поля
    private int id;
    private String name;
    private String job;
    private String eMail;
    private int phoneNumber;
    private int salary;
    private int age;
    // Поле для подсчета объектов
    private static int counter;

    // Инициализатор поля ID с увеличением на единицу при каждом создании объекта.
    {
        this.id = ++counter;
    }

    // Конструктор
    public Employer(String name, String job, String eMail, int phoneNumber, int salary, int age) {
        this.name = name;
        this.job = job;
        this.eMail = eMail;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    // Дальше идут все Геттеры

    public static int getCounter() {
        return counter;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getJob() {
        return job;
    }

    public String geteMail() {
        return eMail;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public int getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    /**
     * Метод печатающий информацию об объекте типа Работник (Employer).
     */
    public void printInfo() {
        System.out.printf("ID: %d\t ФИО: %s\t Должность: %s\t E-mail: %s\t Телефон: %d\t Зарплата: %d\t Возраст: %d\n", id, name, job, eMail, phoneNumber, salary, age);
    }
}
