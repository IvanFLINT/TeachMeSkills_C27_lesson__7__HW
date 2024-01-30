package com.teachmeskills.lesson7.task_2.figure;

/**
 * This class describes the shape of a rectangle
 */
public class Rectangle extends Figure {

    double a, b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double areaCalculation() {
        return a * b;
    }

    @Override
    public double perimeterCalculation() {
        return a + a + b + b;
    }
}