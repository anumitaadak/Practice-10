package com.employee;

import java.util.Random;

public class Employee {
    static final int WAGE_PER_HOUR = 20;
    int empHrs = 0;
    int empWage = 0;

    public static void main(String[] args) {

        System.out.println("Welcome to Employee Wage Computation Program");

        Random random = new Random();
        int x = random.nextInt(3);
        System.out.println(x);



        Employee main = new Employee();

        main.employeeAttendance();
    }

    void employeeAttendance() {
        Random random = new Random();
        int x = random.nextInt(3);
        System.out.println(x);

        if(x == 1) {
            System.out.println("Employee present");
            empHrs = 8;
        } else if (x == 2) {
            System.out.println("Part time employee");
            empHrs = 4;
        } else {
            System.out.println("Employee absent");
            empHrs = 0;
        }
        empWage = empHrs*WAGE_PER_HOUR;
        System.out.println("Employee wage is: "+empWage);

    }
}
