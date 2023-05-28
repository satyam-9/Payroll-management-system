package com.example.pms.payrollManagementSystem.repository;

import com.example.pms.payrollManagementSystem.bean.Salary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface SalaryRepository extends JpaRepository<Salary,Integer> {
    @Query("select s.salary from Salary s where eid=:eid")
    public String findSalaryById(int eid);

}
