package com.example.pms.payrollManagementSystem.service;

import com.example.pms.payrollManagementSystem.bean.Salary;
import com.example.pms.payrollManagementSystem.repository.SalaryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SalaryService {
    private final SalaryRepository salaryRepository;

    @Autowired
    public SalaryService(SalaryRepository salaryRepository){
        this.salaryRepository = salaryRepository;
    }
    public String storeSalary(Salary salary) {
        salaryRepository.save(salary);
        return "Salary details stored";
    }

    public String findSalaryById(int eid) {
        return salaryRepository.findSalaryById(eid);

    }

}