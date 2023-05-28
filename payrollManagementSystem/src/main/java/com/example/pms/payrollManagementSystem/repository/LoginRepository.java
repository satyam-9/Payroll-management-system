package com.example.pms.payrollManagementSystem.repository;

import com.example.pms.payrollManagementSystem.bean.Login;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoginRepository extends JpaRepository<Login,String> {
}
