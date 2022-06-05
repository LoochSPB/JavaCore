package ru.GB.lesson_5;

public class Homework {

    public static void main(String[] args) {

        // Создадим массив объектов типа Employer
        Employer [] group = new Employer[5];

        // Заполним его объектами
        group [0] = new Employer("Han Solo", "Pilot", "MillenniumFalcon@google.com", 802005858, 30000, 35);
        group [1] = new Employer("Chewbacca", "Mechanic", "AAAARRRGHH@vuki.space", 100000002, 20000, 146);
        group [2] = new Employer("Yoda", "Master Jedi", "Power_inside@wsdm.pwr", 2005858, 180000, 724);
        group [3] = new Employer("Luke Skywalker", "Jedi Junior", "WhereMySword@google.com", 802005858, 500000, 27);
        group [4] = new Employer("Darth Vader", "Luke Father", "info@DeathStar.org", 911, 3000000, 65);

        ageSearch(group,40);


    }

    /**
     * Метод, позволяющий искать сотрудников в массиве
     * по указанному возрасту и выводить о них информацию в консоль
     * @param group Массив с данными сотрудников
     * @param age Необходимый для поиска возраст
     */
    private static void ageSearch(Employer[] group, int age) {
        for (int i = 0; i < group.length; i++) {
            if (group[i].getAge() >= age) {
                group[i].printInfo();
            }
        }
    }

}
