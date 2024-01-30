package com.teachmeskills.lesson7.task_1.title;

import com.teachmeskills.lesson7.task_1.jobTitle.IPositions;

/**
 * This class contains descriptions of the accountant object
 */
public class Accountant implements IPositions {

    public void description() {
        Description ds = new Description("Зарубова Елена Николаевна", 35, 2000.345);
        System.out.println("Бухгалтер: " + ds.name + " ,Возраст: " + ds.age + " ,Заработная плата: " + ds.salary);
    }
}
