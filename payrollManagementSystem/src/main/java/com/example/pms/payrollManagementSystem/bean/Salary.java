package com.example.pms.payrollManagementSystem.bean;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Salary {
    @Id
    private int salaryid;
    private Integer eid;
    private String month;
    private int salary;

    public Salary(int salaryid, int eid, String month, int salary) {
        super();
        this.salaryid = salaryid;
        this.eid = eid;
        this.month = month;
        this.salary = salary;
    }

    public Salary() {
        super();

    }

    public int getSalaryid() {
        return salaryid;
    }
    public void setSalaryid(int salaryid) {
        this.salaryid = salaryid;
    }
    public int getEid() {
        return eid;
    }
    public void setEid(int eid) {
        this.eid = eid;
    }
    public String getMonth() {
        return month;
    }
    public void setMonth(String month) {
        this.month = month;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    @Override
    public String toString() {
        return "Salary [salaryid=" + salaryid + ", eid=" + eid + ", month=" + month + ", salary=" + salary + "]";
    }


}

