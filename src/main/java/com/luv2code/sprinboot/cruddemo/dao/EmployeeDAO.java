package com.luv2code.sprinboot.cruddemo.dao;

import com.luv2code.sprinboot.cruddemo.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    List<Employee> findAll();
}
