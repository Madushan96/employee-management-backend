package com.app.backend.service;

import com.app.backend.entity.Employee;

import java.util.List;

public interface EmployeeService {
    public List<Employee> getEmployeeList();

    public Employee createEmployee(Employee employee);

    public Employee getEmployeeById(long id);

    public Employee updateEmployee(long id, Employee employee);

    public void deleteEmployeeById(long id);
}
