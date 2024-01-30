package com.teachmeskills.lesson7.task_2.runner;

import com.teachmeskills.lesson7.task_2.figure.*;

/**
 * This program execution class
 */

public class Runner {

    public static void main(String[] args) {
        Circle cir = new Circle(4);
        Rectangle rec = new Rectangle(6, 5);
        Triangle tri = new Triangle(4, 3, 5, 4);
        Trapeze tra = new Trapeze(4, 6, 5);
        Ellipse el = new Ellipse(8, 5);

        String[] arrSquare = new String[]{cir.areaCalculation(), rec.areaCalculation(),
                tri.areaCalculation(), tra.areaCalculation(), el.areaCalculation(),
                cir.perimeterCalculation(), rec.perimeterCalculation(),
                tri.perimeterCalculation(), tra.perimeterCalculation(), el.perimeterCalculation()};

        for (String s : arrSquare) {
            System.out.println(s);
        }
    }
}

