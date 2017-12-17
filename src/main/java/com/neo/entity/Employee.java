package com.neo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Employee {
    @Id
    @GeneratedValue
    private long emp_id;
    @Column(nullable = false, unique = true)
    private String emp_account;
    @Column(nullable = false)
    private String emp_password;
    @Column(nullable = false)
    private String emp_name;
    @Column(nullable = false)
    private String emp_className;
    @Column(nullable = false)
    private long emp_tel;
    @Column(nullable = false)
    private String emp_bedroom;
    @Column(nullable = false)
    private String dept_name;
    @Column(nullable = false)
    private long mgr_id;
    @Column(nullable = false)
    private String emp_type;

    public long getEmp_id() {
        return emp_id;
    }

    public Employee setEmp_id(long emp_id) {
        this.emp_id = emp_id;
        return this;
    }

    public String getEmp_account() {
        return emp_account;
    }

    public Employee setEmp_account(String emp_account) {
        this.emp_account = emp_account;
        return this;

    }

    public String getEmp_password() {
        return emp_password;
    }

    public Employee setEmp_password(String emp_password) {
        this.emp_password = emp_password;
        return this;
    }

    public String getEmp_name() {
        return emp_name;
    }

    public Employee setEmp_name(String emp_name) {
        this.emp_name = emp_name;
        return this;
    }

    public String getEmp_className() {
        return emp_className;
    }

    public Employee setEmp_className(String emp_className) {
        this.emp_className = emp_className;
        return this;
    }

    public long getEmp_tel() {
        return emp_tel;
    }

    public Employee setEmp_tel(long emp_tel) {
        this.emp_tel = emp_tel;
        return this;
    }

    public String getEmp_bedroom() {
        return emp_bedroom;
    }

    public Employee setEmp_bedroom(String emp_bedroom) {
        this.emp_bedroom = emp_bedroom;
        return this;
    }

    public String getDept_name() {
        return dept_name;
    }

    public Employee setDept_name(String dept_name) {
        this.dept_name = dept_name;
        return this;
    }

    public long getMgr_id() {
        return mgr_id;
    }

    public Employee setMgr_id(long mgr_id) {
        this.mgr_id = mgr_id;
        return this;
    }

    public String getEmp_type() {
        return emp_type;
    }

    public Employee setEmp_type(String emp_type) {
        this.emp_type = emp_type;
        return this;
    }
}
