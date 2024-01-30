package com.teachmeskills.lesson7.task_2.figure;

/**
 * This class describes the shape of a trapezoid
 */
public class Trapeze extends Figure {
    double a , b , h;
    public Trapeze(double a, double b, double h){
        this.a = a;
        this.b = b;
        this.h = h;
    }
    @Override
    public double areaCalculation() {
        return (a + b) * h / 2;
    }

    @Override
    public double perimeterCalculation() {
        return a + a + b + b;
    }
}
