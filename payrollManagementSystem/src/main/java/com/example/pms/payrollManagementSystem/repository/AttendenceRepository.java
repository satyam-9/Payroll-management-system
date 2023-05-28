package com.example.pms.payrollManagementSystem.repository;

import com.example.pms.payrollManagementSystem.bean.Attendance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface AttendenceRepository extends JpaRepository<Attendance,Integer> {

    @Query("select s.status from Attendance s where eid=:eid")
    public String findAttendanceById(int eid);
}
