package com.siemens.service.shuttle.entity;

import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "device")
public class Device {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", unique = true, nullable = false)
  private long id;

  @OneToOne(cascade = CascadeType.REFRESH)
  private Shuttle shuttle;

  @Column(name = "IMIE", nullable = false)
  private String imei;

  @Column(name = "serial_number", nullable = false)
  private String serialNumber;

  @Column(name = "status", nullable = false)
  private Boolean status;

  @Column(name = "activation_date", nullable = false)
  private Date activationDate;

  public Device() {
  }

  public Device(Shuttle shuttle, String imei, String serialNumber, Boolean status, Date activationDate) {
    this.shuttle = shuttle;
    this.imei = imei;
    this.serialNumber = serialNumber;
    this.status = status;
    this.activationDate = activationDate;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public Shuttle getShuttle() {
    return shuttle;
  }

  public void setShuttle(Shuttle shuttle) {
    this.shuttle = shuttle;
  }

  public String getImei() {
    return imei;
  }

  public void setImei(String imei) {
    this.imei = imei;
  }

  public String getSerialNumber() {
    return serialNumber;
  }

  public void setSerialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
  }

  public Boolean getStatus() {
    return status;
  }

  public void setStatus(Boolean status) {
    this.status = status;
  }

  public Date getActivationDate() {
    return activationDate;
  }

  public void setActivationDate(Date activationDate) {
    this.activationDate = activationDate;
  }
}
