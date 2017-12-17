package com.neo.service.impl;

import com.neo.entity.Employee;
import com.neo.repository.EmployeeRepository;
import com.neo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{
    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<Employee> getEmployeeList() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee findEmployeeByemp_id(long emp_id) {
        return employeeRepository.findByEmp_id(emp_id);
    }

    @Override
    public void save(Employee employee) {
        employeeRepository.save(employee);

    }

    @Override
    public void edit(Employee employee) {
        employeeRepository.save(employee);

    }

    @Override
    public void delete(long emp_id) {
        employeeRepository.delete(emp_id);

    }
}


