package org.RecordedClasses.singleReponsibilityPrinciple;

public class BioDataReteriver {
    public String getBioData(Employee employee){
        String bioData = "Bio Data for Employee " + employee.getEmployeeId();
        return bioData;
    }
}
