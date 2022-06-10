package com.employee;

import java.util.Random;

public class Employee2 {

    static final int WAGE_PER_HOUR = 20;
    static final int WORKING_DAY_PER_MONTH = 20;
    static final int FULL_TIME_EMPLOYEE = 1;
    static final int PART_TIME_EMPLOYEE = 2;
    static final int MAX_HOURS_IN_MONTH = 100;

    public static void main(String[] args) {
        computeWage();

    }

    public static int computeWage() {
        int empHrs = 0;
        int empWage = 0;
        int totalEmpWage = 0;
        int totalEmpHrs = 0;
        int totalWorkingDays = 0;

        System.out.println("Welcome to Employee Wage Computation Program");

        Random random = new Random();
        int empCheck = random.nextInt(3);
        System.out.println(empCheck);

        while (totalEmpHrs <= MAX_HOURS_IN_MONTH && totalWorkingDays <= WORKING_DAY_PER_MONTH) {
            totalWorkingDays++;
            empCheck = random.nextInt(3);
            switch (empCheck) {
                case FULL_TIME_EMPLOYEE:
                    empHrs = 8;
                    break;
                case PART_TIME_EMPLOYEE:
                    empHrs = 4;
                    break;
                default:
                    empHrs = 0;
            }
            empWage = empHrs * WAGE_PER_HOUR;
            totalEmpHrs += empHrs;
        }
        totalEmpWage = totalEmpHrs * WAGE_PER_HOUR;
        System.out.println("total employee wage : " + totalEmpWage);
        return totalEmpWage;
    }
}

