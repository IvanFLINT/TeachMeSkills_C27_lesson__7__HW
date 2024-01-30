package com.teachmeskills.lesson7.task_1.title;

import com.teachmeskills.lesson7.task_1.jobTitle.IPositions;

/**
 * This class contains descriptions of the director object
 */
public class Director implements IPositions {

    public void description() {
        Description ds = new Description("Петров Иван Иваныч", 45, 4000.345);
        System.out.println("Директор: " + ds.name + " ,Возраст: " + ds.age + " ,Заработная плата: " + ds.salary);
    }
}
