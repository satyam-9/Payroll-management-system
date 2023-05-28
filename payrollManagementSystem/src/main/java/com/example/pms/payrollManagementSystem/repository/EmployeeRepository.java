package com.example.pms.payrollManagementSystem.repository;

import com.example.pms.payrollManagementSystem.bean.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

//    @Query("SELECT e FROM Employee e WHERE e.emailid = :emailid")
    Optional<Employee> findEmployeeByEmailid(String emailid);
}
