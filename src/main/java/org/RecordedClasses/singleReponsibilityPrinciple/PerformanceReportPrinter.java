package org.RecordedClasses.singleReponsibilityPrinciple;

public class PerformanceReportPrinter {
    /**
     * Print a performance report for the given employee.
     *
     * @param employee The employee whose performance report is to be printed.
     * @return The performance report as a string.
     */

    public String printPerformanceReport(Employee employee){
        String performanceReport = "Performance Report for Employee " + employee.getEmployeeId();
        return performanceReport;
    }
}
