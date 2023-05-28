package com.example.pms.payrollManagementSystem.controller;

import com.example.pms.payrollManagementSystem.bean.Login;
import com.example.pms.payrollManagementSystem.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("login")
@CrossOrigin
public class LoginController {

    private final LoginService loginService;

    @Autowired
    public LoginController(LoginService loginService){
        this.loginService = loginService;
    }


    @PostMapping(value = "signIn",consumes = MediaType.APPLICATION_JSON_VALUE)
    public String signIn(@RequestBody Login login) {
        System.out.println("I cam here");
        return loginService.signIn(login);

    }

    @PostMapping(value = "signUp",consumes = MediaType.APPLICATION_JSON_VALUE)
    public String signUp(@RequestBody Login login) {
        System.out.println(login);
        return loginService.signUp(login);
    }


}
