package com.teachmeskills.lesson7.task_2.runner;

import com.teachmeskills.lesson7.task_2.figure.*;

/**
 * This program execution class
 */

public class Runner {

    public static void main(String[] args) {
        var cir = new Circle(4);
        var rec = new Rectangle(6, 5);
        var tri = new Triangle(4, 3, 5, 4);
        var tra = new Trapeze(4, 6, 5);
        var el = new Ellipse(8, 5);

        double[] arrSquare = new double[]{cir.areaCalculation(), rec.areaCalculation(),
                tri.areaCalculation(), tra.areaCalculation(), el.areaCalculation()};
        double[] arrPerimetr = new double[]{cir.perimeterCalculation(), rec.perimeterCalculation(),
                tri.perimeterCalculation(), tra.perimeterCalculation(), el.perimeterCalculation()};
        String[] arr1 = new String[]{
                "Площадь окружности: ", "Площадь прямоугольника: ",
                "Площадь треугольника: ", "Площадь тропеции: ", "Площадь элипса: "
        };
        String[] arr2 = new String[]{
                "Периметр окружности", "Периметр прямоугольника: ",
                "Периметр треугольника: ", "Периметр тропеции: ", "Периметр элипса: "
        };

        for (int i = 0; i < arrSquare.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                if (i == j) {
                    System.out.println(arr1[j] + " " + arrSquare[i]);
                }
            }
        }

        double sum = 0;

        for (int i = 0; i < arrPerimetr.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (i == j) {
                    System.out.println(arr2[j] + " " + arrPerimetr[i]);
                }
            }
            sum += arrPerimetr[i];
        }
        System.out.println("Сумма всех периметров: " + sum);
    }
}
