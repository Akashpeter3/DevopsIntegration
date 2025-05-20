package com.devops.DevopsApplication.repository;

import com.devops.DevopsApplication.dto.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository  extends JpaRepository<Employee,Integer> {


}
