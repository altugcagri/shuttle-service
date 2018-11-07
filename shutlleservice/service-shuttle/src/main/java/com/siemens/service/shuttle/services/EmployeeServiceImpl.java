package com.siemens.service.shuttle.services;

import com.siemens.service.shuttle.dao.EmployeeDao;
import com.siemens.service.shuttle.dao.ShuttleDao;
import com.siemens.service.shuttle.entity.Company;
import com.siemens.service.shuttle.entity.Department;
import com.siemens.service.shuttle.entity.Employee;
import com.siemens.service.shuttle.entity.Shuttle;
import com.siemens.service.shuttle.entity.SmartCard;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

@Service
public class EmployeeServiceImpl implements EmployeeService {

  @Autowired
  private EmployeeDao employeeDao;

  @Autowired
  private ShuttleDao shuttleDao;

  @Transactional
  public Employee addEmployee(String firstName, String lastName, Company company, Department department, Shuttle shuttle, boolean status, SmartCard smartCard) {
    if (!employeeDao.listEmployee(smartCard.getId()).isEmpty()) {
      return employeeDao.listEmployee(smartCard.getId()).get(0);
    }

    return employeeDao.addEmployee(new Employee(firstName, lastName, company, department, shuttle, new Date(), status, smartCard));
  }

  @Transactional
  public Employee updateEmployee(long employeeId, String firstName, String lastName, Company company, Department department, Shuttle shuttle, boolean status,
      SmartCard smartCard) {

    Employee employee = employeeDao.getEmployee(employeeId);

    if (!StringUtils.isEmpty(firstName) && !firstName.equals(employee.getName())) {
      employee.setName(firstName);
    }

    if (!StringUtils.isEmpty(lastName) && !lastName.equals(employee.getSurname())) {
      employee.setSurname(lastName);
    }

    if (null != company && company.getId() != employee.getCompany().getId()) {
      employee.setCompany(company);
    }

    if (null != department && department.getId() != employee.getDepartment().getId()) {
      employee.setDepartment(department);
    }

    if (null != shuttle && shuttle.getId() != employee.getShuttle().getId()) {
      employee.setShuttle(shuttle);
    }

    if (status != employee.getStatus()) {
      employee.setStatus(status);
    }
    if (null != smartCard && smartCard.getId() != employee.getSmartCard().getId()) {
      employee.setSmartCard(smartCard);
    }
    return employeeDao.updateEmployee(employee);
  }

  @Transactional
  public boolean deleteEmployee(long employeeId) {
    Employee employee = employeeDao.getEmployee(employeeId);
    if (employee == null) {
      return false;
    }
    return employeeDao.deleteEmployee(employee);
  }

  @Transactional
  public Employee getEmployee(long enployeeId) {
    return employeeDao.getEmployee(enployeeId);
  }

  @Transactional(readOnly = true)
  public List<Employee> listEmployee() {
    return employeeDao.listEmployee();
  }

  @Transactional(readOnly = true)
  public List<Employee> listEmployee(long cardId) {
    return employeeDao.listEmployee(cardId);
  }
}
