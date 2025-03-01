package org.RecordedClasses.singleReponsibilityPrinciple;

public class Employee {
    private final int employeeId;
    public Employee(int employeeId){
        this.employeeId = employeeId;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public double calculateSalary(){
        return 0;
    }

    public String printPerformanceReport(){
        return "";
    }

    public String bioData(){
        return "";
    }

}
