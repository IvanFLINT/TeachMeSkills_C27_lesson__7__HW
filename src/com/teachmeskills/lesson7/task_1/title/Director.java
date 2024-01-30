package com.teachmeskills.lesson7.task_1.title;

import com.teachmeskills.lesson7.task_1.jobTitle.IPositions;

/**
 * This class contains descriptions of the director object
 */
public class Director implements IPositions {
    String name = "Петров Иван Иваныч";
    double salary = 4000.345;
    int age = 45;

    public void description() {
        System.out.println("Директор: " + name + " ,Возраст: " + age + " ,Заработная плата: " + salary);
    }
}
