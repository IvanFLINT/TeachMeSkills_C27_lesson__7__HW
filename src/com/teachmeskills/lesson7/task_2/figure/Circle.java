package com.teachmeskills.lesson7.task_2.figure;

/**
 * This class describes the shape of a circle
 */
public class Circle extends Figure {
    double r;
    final double PI = 3.14;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public double areaCalculation() {
        return PI * r * r;
    }

    @Override
    public double perimeterCalculation() {
        return 2 * PI * r;
    }
}
