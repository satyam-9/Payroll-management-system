package com.example.pms.payrollManagementSystem.controller;

import com.example.pms.payrollManagementSystem.bean.Salary;
import com.example.pms.payrollManagementSystem.service.SalaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("salary")
@CrossOrigin
public class SalaryController {
    private final SalaryService salaryService;

    @Autowired
    public SalaryController(SalaryService salaryService){
        this.salaryService = salaryService;
    }
    @PostMapping(value = "storeSalary",consumes = MediaType.APPLICATION_JSON_VALUE)
    public String storeSalary(@RequestBody Salary salary) {
        return salaryService.storeSalary(salary);
    }



    @GetMapping(value="findsalary/{eid}")
    public String findSalaryById(@PathVariable("eid") int eid) {
        return salaryService.findSalaryById(eid);
    }

}

