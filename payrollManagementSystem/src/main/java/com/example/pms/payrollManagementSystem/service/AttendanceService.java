package com.example.pms.payrollManagementSystem.service;

import com.example.pms.payrollManagementSystem.bean.Attendance;
import com.example.pms.payrollManagementSystem.repository.AttendenceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AttendanceService {

    private final AttendenceRepository attendenceRepository;

    @Autowired
    public AttendanceService(AttendenceRepository attendenceRepository){
        this.attendenceRepository = attendenceRepository;
    }
    public String storeAttendance(Attendance attendance) {
        attendenceRepository.save(attendance);
        return "Attendance details stored";
    }

    public List<Attendance> getAllAttendance(){
        return attendenceRepository.findAll();
    }

    public String findAttendanceById(int eid) {
        return attendenceRepository.findAttendanceById(eid);

    }
}

