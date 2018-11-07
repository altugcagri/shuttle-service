package com.siemens.service.shuttle.entity;

import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Shuttle.class)
public class Shuttle_ {

  public static volatile SingularAttribute<Shuttle, Long> id;
  public static volatile SingularAttribute<Shuttle, Long> deviceId;
  public static volatile SingularAttribute<Shuttle, String> routeName;
  public static volatile SingularAttribute<Shuttle, String> routeDescription;
  public static volatile SingularAttribute<Shuttle, String> plate;

}
