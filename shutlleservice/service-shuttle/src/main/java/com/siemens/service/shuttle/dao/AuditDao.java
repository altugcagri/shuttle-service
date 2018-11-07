package com.siemens.service.shuttle.dao;

import com.siemens.service.shuttle.entity.Audit;
import java.util.List;


public interface AuditDao {

  Audit addAudit(Audit audit);

  List<Audit> listAudit();

}
