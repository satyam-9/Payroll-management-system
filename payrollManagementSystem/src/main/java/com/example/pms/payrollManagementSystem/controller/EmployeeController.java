package com.example.pms.payrollManagementSystem.controller;

import com.example.pms.payrollManagementSystem.bean.Employee;
import com.example.pms.payrollManagementSystem.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("employee")
@CrossOrigin

public class EmployeeController {

    private final EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService){
        this.employeeService = employeeService;
    }


    @PostMapping(value = "storeEmployee",consumes = MediaType.APPLICATION_JSON_VALUE)// consumes attribute specifies the media type of the request payload
    public String storeEmployee(@RequestBody Employee employee) {
        return employeeService.storeEmployee(employee);
    }

    @PatchMapping(value = "updateEmployee",consumes = MediaType.APPLICATION_JSON_VALUE)
    public String updateEmployee(@RequestBody Employee employee) {
        return employeeService.updateEmployee(employee);
    }

    @GetMapping(value="findEmployeeId/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public Optional<Employee> getEmployeebyId(@PathVariable("id")int id) {
        return employeeService.findEmployeeId(id);
    }

    @GetMapping(value="findAllEmployee",produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }
    //get employee by emailid
    @GetMapping(value = "findbyemail/{emailid}")
    public Optional<Employee> findEmployeeByEmailid(@PathVariable("emailid") String emailid){
        return employeeService.findEmployeeByEmailid(emailid);
    }

    @DeleteMapping(value="deleteEmployee/{id}")
    public String deleteEmployeeUsingId(@PathVariable("id") int id) {
        return employeeService.deleteEmployee(id);
    }

    @PatchMapping(value = "updateEmployeebyuser",consumes = MediaType.APPLICATION_JSON_VALUE)
    public String updateEmployeebyuser(@RequestBody Employee employee) {
        return employeeService.updateEmployeebyuser(employee);
    }

}
