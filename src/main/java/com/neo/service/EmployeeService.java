package com.neo.service;

import com.neo.entity.Employee;

import java.util.List;

public interface EmployeeService {

    public List<Employee> getEmployeeList();

    public Employee findEmployeeByemp_id(long emp_id);
    public void save(Employee employee);
    public void edit(Employee employee);

    public void delete(long emp_id);





}
