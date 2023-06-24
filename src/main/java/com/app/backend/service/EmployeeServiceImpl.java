package com.app.backend.service;

import com.app.backend.entity.Employee;
import com.app.backend.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<Employee> getEmployeeList() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee createEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public Employee getEmployeeById(long id) {
        return employeeRepository.findById(id).get();
    }

    @Override
    public Employee updateEmployee(long id, Employee employee) {
        Employee currentEmployee = getEmployeeById(id);

        currentEmployee.setFirstName(employee.getFirstName());
        currentEmployee.setLastName(employee.getLastName());
        currentEmployee.setFullName(employee.getFullName());
        currentEmployee.setNameWithInitials(employee.getNameWithInitials());
        currentEmployee.setDob(employee.getDob());
        currentEmployee.setAddress(employee.getAddress());
        currentEmployee.setImageUrl(employee.getImageUrl());
        currentEmployee.setMaritalStatusId(employee.getMaritalStatusId());
        currentEmployee.setTeamId(employee.getTeamId());
        currentEmployee.setDesignationId(employee.getDesignationId());

        return employeeRepository.save(currentEmployee);
    }

    @Override
    public void deleteEmployeeById(long id) {
        employeeRepository.deleteById(id);
    }
}
