package com.employee;

import java.util.Random;

public class Employee1 {

    static final int WAGE_PER_HOUR = 20;
    static final int WORKING_DAY_PER_MONTH = 20;
    static final int FULL_TIME_EMPLOYEE = 1;
    static final int PART_TIME_EMPLOYEE = 2;
    static final int ABSENT_EMPLOYEE = 0;


    public static void main(String[] args) {

        int empHrs = 0;
        int empWage = 0;
        int totalEmpWage = 0;

        System.out.println("Welcome to Employee Wage Computation Program");


            Random random = new Random();
            int empCheck = random.nextInt(3);
            System.out.println(empCheck);

        for (int i = 0; i < WORKING_DAY_PER_MONTH; i++) {
            switch (empCheck) {
                case FULL_TIME_EMPLOYEE:
                    //System.out.println("Employee present");
                    empHrs = 8;
                    break;
                case PART_TIME_EMPLOYEE:
                    //System.out.println("Part time employee");
                    empHrs = 4;
                    break;
                default:
                    //System.out.println("Employee absent");
                    empHrs = 0;
            }
            empWage = empHrs * WAGE_PER_HOUR;
            totalEmpWage += empWage;
        }

            System.out.println("Employee daily wage is: " + empWage);
            System.out.print("Employee total wage is: " + totalEmpWage);

        }
    }

