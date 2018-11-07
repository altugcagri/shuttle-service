package com.siemens.service.shuttle.services;


import com.siemens.service.shuttle.entity.Audit;
import java.util.Date;
import java.util.List;

public interface AuditService {

  Audit addAudit(long deviceId, long cardId, String location, Date date);

  List<Audit> listAudit();

}
