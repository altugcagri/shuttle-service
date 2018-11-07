package com.siemens.service.shuttle.dao;

import com.siemens.service.shuttle.entity.Employee;
import java.util.List;

public interface EmployeeDao {


  Employee addEmployee(Employee user);

  Employee updateEmployee(Employee user);

  boolean deleteEmployee(Employee user);

  Employee getEmployee(long userId);

  List<Employee> listEmployee();

  List<Employee> listEmployee(long cardId);
}
