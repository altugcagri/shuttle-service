package com.siemens.service.shuttle.dao;


import com.siemens.service.shuttle.entity.Employee;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDaoImpl implements EmployeeDao{

  @Override
  public Employee addEmployee(Employee user) {
    return null;
  }

  @Override
  public Employee updateEmployee(Employee user) {
    return null;
  }

  @Override
  public boolean deleteEmployee(Employee user) {
    return false;
  }

  @Override
  public Employee getEmployee(long userId) {
    return null;
  }

  @Override
  public List<Employee> listEmployee() {
    return null;
  }

  @Override
  public List<Employee> listEmployee(long cardId) {
    return null;
  }
}
