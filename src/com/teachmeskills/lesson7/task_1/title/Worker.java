package com.teachmeskills.lesson7.task_1.title;

import com.teachmeskills.lesson7.task_1.jobTitle.IPositions;

/**
 * This class contains descriptions of the worker object
 */
public class Worker implements IPositions {

    public void description() {
        Description ds = new Description("Плюшкин Лелик Леликович", 38, 800.864);
        System.out.println("Рабочий: " + ds.name + " ,Возраст: " + ds.age + " ,Заработная плата: " + ds.salary);
    }
}
