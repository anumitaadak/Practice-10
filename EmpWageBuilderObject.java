package com.employee;

import java.util.Random;

public class EmpWageBuilderObject {

    static final int FULL_TIME_EMPLOYEE = 1;
    static final int PART_TIME_EMPLOYEE = 2;

    private final String company;
    private final int maxHrsPerMonth;
    private final int workingDayPerMonth;
    private final int wagePerHour;
    private int totalEmpWage;

    EmpWageBuilderObject(String company,int maxHrsPerMonth,int workingDayPerMonth,int wagePerHour){
        this.company = company;
        this.maxHrsPerMonth = maxHrsPerMonth;
        this.workingDayPerMonth = workingDayPerMonth;
        this.wagePerHour = wagePerHour;
        }

    public void computeWage() {
        int empHrs = 0;
        int empWage = 0;
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
    }

    @Override
    public String toString() {
        return("Total wage by company:"+ company +" is "+ totalEmpWage);
    }

    public static void main(String[] args) {
        EmpWageBuilderObject empWageBuilderObject = new EmpWageBuilderObject("Reliance",30,10,15);
        EmpWageBuilderObject empWageBuilderObject1 = new EmpWageBuilderObject("Big Basket",25,28,35);

        empWageBuilderObject.computeWage();
        empWageBuilderObject1.computeWage();

        System.out.println(empWageBuilderObject);
        System.out.println(empWageBuilderObject1);
    }
}
