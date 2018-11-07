package com.siemens.service.shuttle.services;


import com.siemens.service.shuttle.dao.AuditDao;
import com.siemens.service.shuttle.dao.EmployeeDao;
import com.siemens.service.shuttle.dao.ShuttleDao;
import com.siemens.service.shuttle.dao.UserDao;
import com.siemens.service.shuttle.entity.Audit;
import com.siemens.service.shuttle.entity.Employee;
import com.siemens.service.shuttle.entity.Shuttle;
import com.siemens.service.shuttle.entity.User;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuditServiceImpl implements AuditService {

  @Autowired
  private AuditDao auditDao;

  @Autowired
  private EmployeeDao employeeDao;

  @Autowired
  private ShuttleDao shuttleDao;

  @Override
  public Audit addAudit(long deviceId, long cardId, String location, Date date) {

    Shuttle shuttle = shuttleDao.listShuttle(deviceId).get(0);
    Employee employee = employeeDao.listEmployee(cardId).get(0);

    if (shuttle != null && employee != null) {
      return auditDao.addAudit(new Audit(shuttle, employee, date, location));
    }
    return null;
  }

  @Override
  public List<Audit> listAudit() {
    return auditDao.listAudit();
  }
}
