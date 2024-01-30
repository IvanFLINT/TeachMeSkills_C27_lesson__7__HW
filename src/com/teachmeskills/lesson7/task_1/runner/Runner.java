package com.teachmeskills.lesson7.task_1.runner;

import com.teachmeskills.lesson7.task_1.title.Accountant;
import com.teachmeskills.lesson7.task_1.title.Director;
import com.teachmeskills.lesson7.task_1.title.Worker;

import java.util.Scanner;
/**
 * This program execution class
 */
public class Runner {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        var d1 = new Director();
        var w1 = new Worker();
        var a1 = new Accountant();

        System.out.print("Введите должность - Директор, Бухгалтер, Рабочий: ");
        String jobTitle = sc.nextLine();

        switch (jobTitle){
            case "Директор": d1.description(); break;
            case "Бухгалтер": a1.description(); break;
            case "Рабочий": w1.description(); break;
            default:
                System.out.println("Такой должности нет"); break;
        }
        sc.close();
    }
}
