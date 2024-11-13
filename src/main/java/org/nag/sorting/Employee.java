package org.nag.sorting;

import java.util.Objects;

public class Employee {
    private int empId;
    private String empName;
    private String departmentId;
    private double empSalary;

    public Employee(int empId, String empName, String departmentId, double empSalary) {
        this.empId = empId;
        this.empName = empName;
        this.departmentId = departmentId;
        this.empSalary = empSalary;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public double getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(double empSalary) {
        this.empSalary = empSalary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", departmentId='" + departmentId + '\'' +
                ", empSalary=" + empSalary +
                '}';
    }


}
