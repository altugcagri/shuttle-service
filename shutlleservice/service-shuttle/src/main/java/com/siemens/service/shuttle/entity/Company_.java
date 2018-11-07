package com.siemens.service.shuttle.entity;

import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel( Company.class )
public class Company_ {

  public static volatile SingularAttribute<Company, Long> id;
  public static volatile SingularAttribute<Company, String> name;


}
