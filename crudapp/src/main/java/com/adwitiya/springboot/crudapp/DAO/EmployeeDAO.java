package com.adwitiya.springboot.crudapp.DAO;

import com.adwitiya.springboot.crudapp.Entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    List<Employee> findAll();
    Employee findById(int id);
}
