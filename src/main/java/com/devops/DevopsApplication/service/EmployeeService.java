package com.devops.DevopsApplication.service;


import com.devops.DevopsApplication.dto.Employee;
import com.devops.DevopsApplication.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
    public class EmployeeService {

        @Autowired
        private EmployeeRepository employeeRepository;

        // Create a new Employee
        public Employee createEmployee(Employee employee) {
            return employeeRepository.save(employee);
        }

        // Retrieve all Employees
        public List<Employee> getAllEmployees() {
            return employeeRepository.findAll();
        }

        // Retrieve an Employee by ID
        public Optional<Employee> getEmployeeById(int id) {
            return employeeRepository.findById(id);
        }

        // Update an existing Employee
        public Employee updateEmployee(int id, Employee updatedEmployee) {
            return employeeRepository.findById(id).map(employee -> {
                employee.setName(updatedEmployee.getName());
                employee.setAge(updatedEmployee.getAge());
                employee.setSalary(updatedEmployee.getSalary());
                return employeeRepository.save(employee);
            }).orElseThrow(() -> new RuntimeException("Employee not found with id " + id));
        }

        // Delete an Employee by ID
        public void deleteEmployee(int id) {
            employeeRepository.deleteById(id);
        }
    }

