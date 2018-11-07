package com.siemens.service.shuttle.controller;

import com.siemens.service.shuttle.entity.Audit;
import com.siemens.service.shuttle.services.AuditService;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("auditApi")
public class AuditController {

  @Autowired
  private AuditService auditService;

  @PostMapping("audit")
  public ResponseEntity<Audit> addAudit(@RequestParam("deviceId") long deviceId, @RequestParam("cardId") long cardId,
      @RequestParam("location") String location) {

    Audit audit = auditService.addAudit(deviceId, cardId, location, new Date());

    if (audit == null) {
      return new ResponseEntity<>(HttpStatus.CONFLICT);
    }
    audit.getEmployee().setShuttle(null);
    return new ResponseEntity<>(audit, HttpStatus.OK);
  }

  @GetMapping("audits")
  public ResponseEntity<List<Audit>> getUsers() {
    List<Audit> audits = auditService.listAudit();
    for (Audit audit : audits) {
      audit.getEmployee().setShuttle(null);
    }
    return new ResponseEntity<>(audits, HttpStatus.OK);
  }
}
