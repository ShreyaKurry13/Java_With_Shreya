package com.company;
import java.util.Scanner;
public class CWH_expt_1 {
    public static void main(String[] args) {
        int empid;
        String empname;
        double basicsalary,hra,da,gs, incometax, netsalary;

            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the EmployeeID");
            empid=sc.nextInt();
            System.out.println("Enter the Employee Name");
            empname=sc.next();
            System.out.println("Enter the Basic Salary of Employee :");
            basicsalary=sc.nextFloat();

            hra=(basicsalary*30)/100;
            da=(basicsalary*70)/100;
            gs=basicsalary+da+hra;
            incometax=(gs*30)/100;
            netsalary=gs-incometax;

            System.out.println("Employee Id:"+empid);
            System.out.println("Employee Name:"+empname);
            System.out.println("Basic Salary:"+basicsalary);
            System.out.println("Employee HRA:"+hra);
            System.out.println("Employee DA:"+da);
            System.out.println("Employee GROSS SALARY:"+gs);
            System.out.println("Income Tax:"+incometax);
            System.out.println("Employee Net Salary:"+netsalary);
    }

}

