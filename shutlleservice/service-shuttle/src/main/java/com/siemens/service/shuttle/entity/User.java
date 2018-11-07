package com.siemens.service.shuttle.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", unique = true, nullable = false)
  private long id;

  @Column(name = "name", nullable = false)
  private String name;

  @Column(name = "surname",  nullable = false)
  private String surname;

  @Column(name = "company", nullable = false)
  private String company;

  @Column(name = "department", nullable = false)
  private String department;

  @Column(name = "mail", nullable = false)
  private String mail;

  @Column(name = "password", nullable = false)
  private String password;


  public User() {
  }

  public User(String name, String surname, String mail, String password) {
    this.name = name;
    this.surname = surname;
    this.mail = mail;
    this.password = password;
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

  public String getCompany() {
    return company;
  }

  public void setCompany(String company) {
    this.company = company;
  }

  public String getDepartment() {
    return department;
  }

  public void setDepartment(String department) {
    this.department = department;
  }

  public String getMail() {
    return mail;
  }

  public void setMail(String mail) {
    this.mail = mail;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

}
