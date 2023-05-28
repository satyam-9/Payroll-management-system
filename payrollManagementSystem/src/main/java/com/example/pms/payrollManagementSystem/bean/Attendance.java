package com.example.pms.payrollManagementSystem.bean;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Attendance {
    @Id
    private int aid;
    private Integer eid;
    private String date;
    private String status;

    public Attendance(int aid, Integer eid, String date, String status) {
        super();
        this.aid = aid;
        this.eid = eid;
        this.date = date;
        this.status = status;
    }

    public Attendance() {
        super();
        // TODO Auto-generated constructor stub
    }

    public int getAid() {
        return aid;
    }
    public void setAid(int aid) {
        this.aid = aid;
    }
    public Integer getEid() {
        return eid;
    }
    public void setEid(Integer eid) {
        this.eid = eid;
    }
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    @Override
    public String toString() {
        return "Attendance [aid=" + aid + ", eid=" + eid + ", date=" + date + ", status=" + status + "]";
    }



}

