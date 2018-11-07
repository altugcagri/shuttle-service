package com.siemens.service.shuttle.entity;

import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "audit")
public class Audit {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", unique = true, nullable = false)
  private long auditId;

  @ManyToOne(cascade = CascadeType.REFRESH)
  private Shuttle shuttle;

  @ManyToOne(cascade = CascadeType.REFRESH)
  private Employee employee;

  @Column(name = "date", nullable = false)
  private Date date;

  @Column(name = "location")
  private String location;

  public Audit() {
  }

  public Audit(Shuttle shuttle, Employee employee, Date date, String location) {
    this.shuttle = shuttle;
    this.employee = employee;
    this.date = date;
    this.location = location;
  }

  public long getAuditId() {
    return auditId;
  }

  public void setAuditId(long auditId) {
    this.auditId = auditId;
  }

  public Shuttle getShuttle() {
    return shuttle;
  }

  public void setShuttle(Shuttle shuttle) {
    this.shuttle = shuttle;
  }

  public Employee getEmployee() {
    return employee;
  }

  public void setEmployee(Employee employee) {
    this.employee = employee;
  }

  public Date getDate() {
    return date;
  }

  public void setDate(Date date) {
    this.date = date;
  }

  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }
}
