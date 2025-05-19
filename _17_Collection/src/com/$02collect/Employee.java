package com.$02collect;

// 추상 클래스는 상속을 전제로 한다.
// 추상 클래스 자체는 객체를 인스턴스화 할 수 없다. -> 객체 못 만든다.
public abstract class Employee {
    protected String empNo;
    protected String empName;
    
    public Employee(String empNo, String empName) {
        this.empNo = empNo;
        this.empName = empName;
    }
    
    @Override
    public String toString() {
        return "---------------------------\n" + 
                "empNo : " + this.empNo + "\n" +
                "empName : " + this.empName + "\n";
    }

    public abstract double getMonthPay();

    public String getEmpNo() {
        return this.empNo;
    }

    public void setEmpNo(String empNo) {
        this.empNo = empNo;
    }

    public String getEmpName() {
        return this.empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }


    
}
