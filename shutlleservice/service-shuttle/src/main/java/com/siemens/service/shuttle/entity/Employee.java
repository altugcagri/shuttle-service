package com.siemens.service.shuttle.entity;

import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", unique = true, nullable = false)
  private long id;

  @Column(name = "name", nullable = false)
  private String name;

  @Column(name = "surname", nullable = false)
  private String surname;

  @OneToOne(cascade = CascadeType.REFRESH)
  private Company company;

  @OneToOne(cascade = CascadeType.REFRESH)
  private Department department;

  @OneToOne(cascade = CascadeType.REFRESH)
  private Shuttle shuttle;

  @Column(name = "registration_date", nullable = false)
  private Date registrationDate;

  @Column(name = "status", nullable = false)
  private Boolean status;

  @OneToOne(cascade = CascadeType.REFRESH)
  private SmartCard smartCard;

  public Employee() {
  }

  public Employee(String name, String surname, Company company, Department department, Shuttle shuttle, Date registrationDate, Boolean status,
      SmartCard SmartCard) {
    this.name = name;
    this.surname = surname;
    this.company = company;
    this.department = department;
    this.shuttle = shuttle;
    this.registrationDate = registrationDate;
    this.status = status;
    this.smartCard = smartCard;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getSurname() {
    return surname;
  }

  public void setSurname(String surname) {
    this.surname = surname;
  }

  public Company getCompany() {
    return company;
  }

  public void setCompany(Company company) {
    this.company = company;
  }

  public Department getDepartment() {
    return department;
  }

  public void setDepartment(Department department) {
    this.department = department;
  }

  public Shuttle getShuttle() {
    return shuttle;
  }

  public void setShuttle(Shuttle shuttle) {
    this.shuttle = shuttle;
  }

  public Date getRegistrationDate() {
    return registrationDate;
  }

  public void setRegistrationDate(Date registrationDate) {
    this.registrationDate = registrationDate;
  }

  public Boolean getStatus() {
    return status;
  }

  public void setStatus(Boolean status) {
    this.status = status;
  }

  public SmartCard getSmartCard() {
    return smartCard;
  }

  public void setSmartCard(SmartCard smartCard) {
    this.smartCard = smartCard;
  }
}
