package com.siemens.service.shuttle.main;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.siemens.service.shuttle")
@SpringBootApplication
public class MainApp {


  public static void main(String[] args) {

    SpringApplication.run(MainApp.class, args);

  }

}
