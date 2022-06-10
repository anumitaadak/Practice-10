package com.employee;

import java.util.Random;

public class Employee3 {

    static final int WORKING_DAY_PER_MONTH = 20;
    static final int FULL_TIME_EMPLOYEE = 1;
    static final int PART_TIME_EMPLOYEE = 2;
    static final int MAX_HOURS_IN_MONTH = 100;

    public static void main(String[] args) {

        System.out.println("Welcome to Employee Wage Computation Program");

        computeWage("Reliance",30,10,15);
        computeWage("Big Basket",25,28,35);

    }

    public static int computeWage(String company,int maxHrsPerMonth,int workingDayPerMonth,int wagePerHour) {
        int empHrs = 0;
        int empWage = 0;
        int totalEmpWage = 0;
        int totalEmpHrs = 0;
        int totalWorkingDays = 0;
        Random random = new Random();

        while (totalEmpHrs <= maxHrsPerMonth && totalWorkingDays <= workingDayPerMonth) {
            totalWorkingDays++;
            int empCheck = random.nextInt(3);
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
            empWage = empHrs * wagePerHour;
            totalEmpHrs += empHrs;
        }
        totalEmpWage = totalEmpHrs * wagePerHour;
        System.out.println("total employee wage : " + totalEmpWage);
        return totalEmpWage;
    }
}



