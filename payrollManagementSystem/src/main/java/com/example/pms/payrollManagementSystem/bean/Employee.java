package com.example.pms.payrollManagementSystem.bean;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class 	Employee {
    @Id
    private int id;
    private String firstname;
    private String lastname;
    private String role;
    private String emailid;
    private String dob;
    private String gender;

    public Employee(int id, String firstname, String lastname, String role, String emailid, String dob, String gender) {
        super();
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.role = role;
        this.emailid = emailid;
        this.dob = dob;
        this.gender = gender;
    }

    public Employee() {
        super();
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getFirstname() {
        return firstname;
    }
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    public String getLastname() {
        return lastname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }
    public String getEmailid() {
        return emailid;
    }
    public void setEmailid(String emailid) {
        this.emailid = emailid;
    }
    public String getDob() {
        return dob;
    }
    public void setDob(String dob) {
        this.dob = dob;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    @Override
    public String toString() {
        return "Employee [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", role=" + role
                + ", emailid=" + emailid + ", dob=" + dob + ", gender=" + gender + "]";
    }


}
