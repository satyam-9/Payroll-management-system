package com.example.pms.payrollManagementSystem.controller;

import com.example.pms.payrollManagementSystem.bean.Attendance;
import com.example.pms.payrollManagementSystem.service.AttendanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("attendance")
@CrossOrigin
public class AttendanceController {
    private final AttendanceService attendanceService;

    @Autowired
    public AttendanceController(AttendanceService attendanceService){
        this.attendanceService = attendanceService;
    }
    @PostMapping(value = "storeAttendance")
    public String storeAttendance(@RequestBody Attendance attendance) {
        return attendanceService.storeAttendance(attendance);
    }

    @GetMapping(value = "getAllAttendance")
    public List<Attendance> getAllAttendance(){
        return attendanceService.getAllAttendance();
    }

    @GetMapping(value="findAttendance/{eid}")
    public String findAttendanceById(@PathVariable("eid") int eid) {
        return attendanceService.findAttendanceById(eid);
    }


}