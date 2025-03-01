package org.RecordedClasses.singleReponsibilityPrinciple;

public class TestSRP {
    public static void main(String[] args){
        Employee employee = new Employee(1);
        SalaryCalculator salaryCalculator = new SalaryCalculator();
        PerformanceReportPrinter performanceReportPrinter = new PerformanceReportPrinter();
        BioDataReteriver bioDataReteriver = new BioDataReteriver();
        System.out.println(salaryCalculator.calculateSalary(employee));
        System.out.println(performanceReportPrinter.printPerformanceReport(employee));
        System.out.println(bioDataReteriver.getBioData(employee));
    }
}
