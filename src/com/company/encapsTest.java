package com.company;
class EncapsulationDemo{
    private int ssn;
    private String EmpName;
    private int empAge;

    public int getSsn() {
        return ssn;
    }

    public void setSsn(int ssn) {
        this.ssn = ssn;
    }

    public String getEmpName() {
        return EmpName;
    }

    public void setEmpName(String empName) {
        EmpName = empName;
    }

    public int getEmpAge() {
        return empAge;
    }

    public void setEmpAge(int empAge) {
        this.empAge = empAge;
    }
}
public class encapsTest {
    public static void main(String[] args) {
        EncapsulationDemo obj = new EncapsulationDemo();
        obj.setEmpName("Shreya");
        obj.setEmpAge(19);
        obj.setSsn(125);

        System.out.println(obj.getEmpName());
        System.out.println(obj.getEmpAge());
        System.out.println(obj.getSsn());
    }
}