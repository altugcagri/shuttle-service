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
@Table(name = "smartCard")
public class SmartCard {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", unique = true, nullable = false)
  private long id;

  @OneToOne(cascade = CascadeType.REFRESH)
  private Employee employee;

  @Column(name = "status", nullable = false)
  private Boolean status;

  @Column(name = "activation_date", nullable = false)
  private Date activationDate;

  @Column(name = "cardNumber", nullable = false)
  private String cardNumber;

  public SmartCard() {
  }

  public SmartCard(Employee employee, Boolean status, Date activationDate, String cardNumber) {
    this.employee = employee;
    this.status = status;
    this.activationDate = activationDate;
    this.cardNumber = cardNumber;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public Employee getEmployee() {
    return employee;
  }

  public void setEmployee(Employee employee) {
    this.employee = employee;
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

  public String getCardNumber() {
    return cardNumber;
  }

  public void setCardNumber(String cardNumber) {
    this.cardNumber = cardNumber;
  }
}
