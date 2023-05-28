package com.example.pms.payrollManagementSystem.service;

import com.example.pms.payrollManagementSystem.bean.Employee;
import com.example.pms.payrollManagementSystem.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;
@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeService(EmployeeRepository employeeRepository){
        this.employeeRepository= employeeRepository;
    }

    public String storeEmployee(Employee employee) {
        employeeRepository.save(employee);
        return "Employee details stored";
    }

    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    public Optional<Employee> findEmployeeId(int id) {
        return employeeRepository.findById(id);
    }

    public Optional<Employee> findEmployeeByEmailid(String emailid) {
        return employeeRepository.findEmployeeByEmailid(emailid);
    }


    public String deleteEmployee(int id) {
        Optional<Employee> result  = employeeRepository.findById(id);
        if(result.isPresent()) {
            Employee e = result.get();
            employeeRepository.delete(e);
            return "Employee deleted successfully";
        }else {
            return "Employee not present";
        }
    }

    public String updateEmployee(Employee employee) {
        Optional<Employee> result  = employeeRepository.findById(employee.getId());
        if(result.isPresent()) {
            Employee e = result.get();
            e.setFirstname(employee.getFirstname());
            e.setLastname(employee.getLastname());
            e.setRole(employee.getRole());
            e.setEmailid(employee.getEmailid());
            employeeRepository.saveAndFlush(e);
            return "Employee details has been updated successfully";
        }else {
            return "Employee not present";
        }
    }

    public String updateEmployeebyuser(Employee employee) {
        Optional<Employee> result  = employeeRepository.findById(employee.getId());
        if(result.isPresent()) {
            Employee e = result.get();
            e.setFirstname(employee.getFirstname());
            e.setLastname(employee.getLastname());
            e.setEmailid(employee.getEmailid());
            e.setGender(employee.getGender());
            e.setDob(employee.getDob());
            employeeRepository.saveAndFlush(e);
            return "Employee details has been updated successfully";
        }else {
            return "Employee not present";
        }
    }


}
