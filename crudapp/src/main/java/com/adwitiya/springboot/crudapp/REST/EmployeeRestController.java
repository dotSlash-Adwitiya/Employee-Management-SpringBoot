package com.adwitiya.springboot.crudapp.REST;

import com.adwitiya.springboot.crudapp.DAO.EmployeeDAO;
import com.adwitiya.springboot.crudapp.Entity.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {

    private EmployeeDAO employeeDAO;

    EmployeeRestController(EmployeeDAO employeeDAO) {
        this.employeeDAO = employeeDAO;
    }

    @GetMapping("/employees")
    public List<Employee> findAll() {
        return employeeDAO.findAll();
    }

    @GetMapping("/employees/{id}")
    public  Employee findById(@PathVariable("id") int employee_id ) {
        return employeeDAO.findById(employee_id);
    }

}
