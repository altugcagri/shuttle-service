package com.siemens.service.shuttle.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "shuttle")
public class Shuttle {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", unique = true, nullable = false)
  private long id;

  @Column(name = "plate", nullable = false)
  private String plate;

  @Column(name = "route_name", nullable = false)
  private String routeName;

  @Column(name = "route_description", nullable = false)
  private String routeDescription;

  @Column(name = "route_map")
  private String routeMap;

  @OneToOne(cascade = CascadeType.REFRESH)
  private Device device;


  public Shuttle() {
  }

  public Shuttle(String plate, String routeName, String routeDescription, String routeMap, Device device) {
    this.plate = plate;
    this.routeName = routeName;
    this.routeDescription = routeDescription;
    this.routeMap = routeMap;
    this.device = device;

  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getPlate() {
    return plate;
  }

  public void setPlate(String plate) {
    this.plate = plate;
  }

  public String getRouteName() {
    return routeName;
  }

  public void setRouteName(String routeName) {
    this.routeName = routeName;
  }

  public String getRouteDescription() {
    return routeDescription;
  }

  public void setRouteDescription(String routeDescription) {
    this.routeDescription = routeDescription;
  }

  public String getRouteMap() {
    return routeMap;
  }

  public void setRouteMap(String routeMap) {
    this.routeMap = routeMap;
  }

  public Device getDevice() {
    return device;
  }

  public void setDevice(Device device) {
    this.device = device;
  }

}
