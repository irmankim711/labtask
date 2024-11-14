/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package averagegradecalculator;

/**
 *
 * @author HP
 */
public class Student {
       private String name;
       double[] marks;

    public Student(String name, double mark1, double mark2, double mark3) {
        this.name = name;
        this.marks = new double[]{mark1, mark2, mark3};
    }

    public double calculateAverage() {
        double total = 0;
        for (double mark : marks) {
            total += mark;
        }
        return total / marks.length;
    }

    public String getName() {
        return name;
    }
}

