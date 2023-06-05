package com.luv2code.sprinboot.cruddemo.service;

import com.luv2code.sprinboot.cruddemo.entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> findAll();
}
