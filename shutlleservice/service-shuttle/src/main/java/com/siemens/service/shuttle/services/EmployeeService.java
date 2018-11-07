package com.siemens.service.shuttle.services;

import com.siemens.service.shuttle.entity.Company;
import com.siemens.service.shuttle.entity.Department;
import com.siemens.service.shuttle.entity.Employee;
import com.siemens.service.shuttle.entity.Shuttle;
import com.siemens.service.shuttle.entity.SmartCard;
import java.util.List;
import org.springframework.stereotype.Component;


public interface EmployeeService {

  Employee addEmployee(String firstName, String lastName, Company company, Department department, Shuttle shuttle, boolean status, SmartCard smartCard);

  Employee updateEmployee(long employeeId, String firstName, String lastName, Company company, Department department, Shuttle shuttle, boolean status,
      SmartCard smartCard);

  boolean deleteEmployee(long userId);

  Employee getEmployee(long userId);

  List<Employee> listEmployee();

  List<Employee> listEmployee(long cardId);
}
