package com.company;

import java.util.Scanner;

public class Employee
{

    static int present=0;
    static int absent=0;
    static int prt_time_days;
    static int days;
    static String name;
    final static int rate =20;
    final static int emphrs = 8;
    final static int part_time  = 4;
    final static int num_of_working_days = 2;
    private static final int Fixed_hrs = 0;
    static int totalwage=0;
    static int part_time_days1=0;


    public static void EmployeeAttendance()
    {

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the employee name :");
        name=sc.next();
        System.out.print("Enter the days :");
        days=sc.nextInt();

        System.out.println("The Employee name is : " + name);

        for (int i = 0; i <= days; i++) {
            double rand = Math.floor(Math.random() * 10 % 2);
            if (rand == 1)
            {
                present++;
            } else if (rand == 0)
            {
                absent++;
            } else {
                break;
            }
        }
        System.out.println(" Total Present Days " + present);
        System.out.println(" Total Absent Days " + absent);
    }

    public static void Empwage()
    {
        EmployeeAttendance();

        int wage = rate * emphrs * present;

        System.out.println("Employee Daily Wage is :  "+wage);

    }

    public static void EmpPartTime() {
        Empwage();

        for (int i = 0; i <= days; i++) {
            double rand = Math.floor(Math.random() * 10 % 3);
            if (rand == 1)
            {
                present++;
            } else if (rand == 0)
            {
                absent++;
            } else if (rand == 2)
            {
                prt_time_days++;
            }
            else {
                break;
            }
        }

        System.out.println("Employee part time hrs " + prt_time_days);
        int Part = rate * part_time * prt_time_days;
        System.out.println("The part time total amount is :  "+Part);
    }

    public static void EmpSwitchcase() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the employee name :");
        name = sc.next();
        System.out.print("Enter the days :");
        days = sc.nextInt();

        System.out.println("The Employee name is : " + name);
        for (int i = 0; i <= days; i++) {
            int Empcheck = (int) Math.floor(Math.random() * 10) % 3;

            switch (Empcheck) {
                case 0:
                    absent++;
                    break;
                case 1:
                    present++;
                    break;
                case 2:
                    part_time_days1++;

            }
        }

        int empwage = rate * emphrs * present;
        int partwage = rate * part_time_days1 * part_time;
        int abwage = rate * emphrs * absent;

        System.out.println(present);
        System.out.println(absent);
        System.out.println(part_time_days1);

        System.out.println("The present wage day amount is :" + empwage);
        System.out.println("The absent days is amount is : " + abwage);
        System.out.println("The part time days wage amount is : " + partwage);
    }

    public static void EmpCal20()
    {
        EmpSwitchcase();
    }

    public static void Caltotalwage() {

        EmpCal20();
        int totaldays=(Fixed_hrs*present)+(part_time*part_time_days1);
        System.out.println("the total days value "+totaldays);
    }

    public static void EmpWageCompany() {
        String name1;
        int rate1, days, count;

        Scanner sc = new Scanner(System.in);
        System.out.print("How many companies you want Compute Employee Wage :");
        count = sc.nextInt();

        for (int j = 1; j <= count; j++) {

            System.out.print("Enter the company name :");
            name1 = sc.next();
            System.out.print("Enter number of working days :");
            days = sc.nextInt();
            System.out.print("Enter employee wage rate :");
            rate1 = sc.nextInt();
            System.out.println("The company name is : " + name1);

            for (int i = 1; i <= days; i++) {
                int emp = (int) Math.floor(Math.random() * 10 % 3);
                switch (emp) {
                    case 0:
                        absent++;
                        break;
                    case 1:
                        present++;
                        break;
                    case 2:
                        part_time_days1++;
                        break;
                }
            }

            int empwage = rate * emphrs * present;
            int partwage = rate * part_time_days1 * part_time;
            int abwage = rate * emphrs * absent;

            System.out.println("The present days is " + present + " and wage amount is : ₹ " + empwage);
            System.out.println("The absent days is " + absent + "  wage amount is : ₹ -"+abwage);
            System.out.println("The part time days is " + part_time_days1 + " wage wage amount is : ₹ " + partwage);

        }
    }


    public static void main(String[] args)
    {
        //EmployeeAttendance();
        //Empwage();
        //EmpPartTime();
        //EmpSwitchcase();
        //EmpCal20();
        //Caltotalwage();
        EmpWageCompany();

    }
}
