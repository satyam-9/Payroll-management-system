package com.example.pms.payrollManagementSystem.service;

import com.example.pms.payrollManagementSystem.bean.Login;
import com.example.pms.payrollManagementSystem.repository.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LoginService {

    private final LoginRepository loginRepository;

    @Autowired
    public LoginService(LoginRepository loginRepository){
        this.loginRepository = loginRepository;
    }


    public String signIn(Login login) {
        Optional<Login> result = loginRepository.findById(login.getEmailid());
        if(result.isPresent()) {
            Login ll = result.get();
            if(ll.getPassword().equals(login.getPassword())) {

                if(login.getTypeOfUser().equals(ll.getTypeOfUser()) && login.getTypeOfUser().equals("admin")) {
                    return "Admin sucessfully login";
                }else if(login.getTypeOfUser().equals(ll.getTypeOfUser()) && login.getTypeOfUser().equals("user")){
                    return "User successfully login";
                }else {
                    return "Invalid details";
                }
            }else {
                return "InValid password";
            }
        }else {
            return "InValid emailId";
        }
    }
    public String signUp(Login login) {
        Optional<Login> result = loginRepository.findById(login.getEmailid());
        if(result.isPresent()) {
            return "Email Id alreay exists";
        }else {
            if(login.getTypeOfUser().equals("admin")) {
                return "You can't create admin account";
            }else {
                loginRepository.save(login);
                return "Account created successfully";
            }

        }
    }



}