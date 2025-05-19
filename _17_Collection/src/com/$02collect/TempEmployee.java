package com.$02collect;


public class TempEmployee extends Employee{
    protected int yearSalary;
    protected int hireYear;


    public TempEmployee(String empNo, String empName, int yearSalary, int hireYear) {
        super(empNo, empName);
        this.yearSalary = yearSalary;
        this.hireYear = hireYear;
    }

    @Override
    public String toString(){
        return super.toString() + 
                "yearSalary : " + this.yearSalary + "\n" +
                "hireYear : " + this.hireYear + "\n" +
                String.format("monthPay : %.2f\n", getMonthPay());
    }

    @Override
    public double getMonthPay() {
        double mPay = (double)this.yearSalary/12;
        return mPay;
    }

}
