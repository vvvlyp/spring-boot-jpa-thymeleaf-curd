package com.neo.web;

import com.neo.entity.Employee;
import com.neo.service.EmployeeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class EmployeeController {

    @Resource
    EmployeeService employeeService;


    @RequestMapping("/")
    public String index() {
        return "redirect:/list1";
    }

    @RequestMapping("/list1")
    public String list1(Model model) {
        List<Employee> employees=employeeService.getEmployeeList();
        model.addAttribute("employees", employees);
        return "employee/list1";
    }

    @RequestMapping("/toAdd1")
    public String toAdd() {
        return "employee/employeeAdd";
    }

    @RequestMapping("/add1")
    public String add(Employee employee) {
        employeeService.save(employee);
        return "redirect:/list1";
    }

    @RequestMapping("/toEdit1")
    public String toEdit(Model model,Long emp_id) {
        Employee employee=employeeService.findEmployeeByemp_id(emp_id);
        model.addAttribute("employee", employee);
        return "employee/employeeEdit";
    }

    @RequestMapping("/edit1")
    public String edit(Employee employee) {
        employeeService.edit(employee);
        return "redirect:/list1";
    }


    @RequestMapping("/delete1")
    public String delete(Long emp_id) {
        employeeService.delete(emp_id);
        return "redirect:/list1";
    }
}
