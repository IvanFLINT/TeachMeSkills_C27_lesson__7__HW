package com.teachmeskills.lesson7.task_1.title;

import com.teachmeskills.lesson7.task_1.jobTitle.IPositions;

/**
 * This class contains descriptions of the worker object
 */
public class Worker implements IPositions {
    String name = "Плюшкин Лелик Леликович";
    double salary = 800.864;
    int age = 38;

    public void description() {
        System.out.println("Рабочий: " + name + " ,Возраст: " + age + " ,Заработная плата: " + salary);
    }
}
