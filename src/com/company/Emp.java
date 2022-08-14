package com.company;
class Emp
{
    public String empName;
    public int empSalary;
    public String address;
    public Emp()
    {
        this("Shreya");
    }

    public Emp(String name)
    {
        this(name, 23000);
    }
    public Emp(String name, int sal)
    {
        this(name, sal, "Prabhadevi");
    }
    public Emp(String name, int sal, String addr)
    {
        this.empName=name;
        this.empSalary=sal;
        this.address=addr;
    }
    void disp() {
        System.out.println("Employee Name: "+empName);
        System.out.println("Employee Salary: "+empSalary);
        System.out.println("Employee Address: "+address);
    }
    public static void main(String[] args)
    {
        Emp obj = new Emp();
        obj.disp();
    }
}
