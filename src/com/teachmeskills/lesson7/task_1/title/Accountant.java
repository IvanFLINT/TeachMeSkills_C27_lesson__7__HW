package com.teachmeskills.lesson7.task_1.title;

import com.teachmeskills.lesson7.task_1.jobTitle.IPositions;

/**
 * This class contains descriptions of the accountant object
 */
public class Accountant implements IPositions {
    String name = "Зарубова Елена Николаевна";
    double salary = 2000.345;
    int age = 35;
    public void description() {
        System.out.println("Бухгалтер: " + name + " ,Возраст: " + age + " ,Заработная плата: " + salary);
    }
}
