package com.teachmeskills.lesson7.task_2.figure;

/**
 * This class describes the shape of a triangle
 */
public class Triangle extends Figure {

    double a, b, c, h;
    public double p;

    public Triangle(double a, double b, double c, double h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.h = h;
    }

    @Override
    public String  areaCalculation() {
        return "Площадь треугольника: " + (a * h) / 2;
    }

    @Override
    public String perimeterCalculation() {
        p = a + b + c;
        return "Периметр треугольника: " + p;
    }
}
