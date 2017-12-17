package com.neo.repository;

import com.neo.entity.Employee;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    Employee findByEmp_id(long emp_id);

    Employee deleteByEmp_id(long emp_id);


}
