package com.siemens.service.shuttle.controller;

import com.siemens.service.shuttle.entity.User;
import com.siemens.service.shuttle.services.EmployeeService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("userApi")
public class UserController {

  @Autowired
  private EmployeeService employeeService;
  /*
    @GetMapping("user/id/{id}")
    public ResponseEntity<User> getUserById(@PathVariable("id") Integer id) {
      User user = employeeService.getEmployee(id);
      return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @GetMapping("user/cardId/{cardId}")
    public ResponseEntity<User> getUserByCardId(@PathVariable("cardId") Integer id) {
      User user = employeeService.getEmployee(id);
      return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @GetMapping("users")
    public ResponseEntity<List<User>> getUsers() {
      List<User> users = employeeService.listEmployee();
      return new ResponseEntity<>(users, HttpStatus.OK);
    }

    @PostMapping("user")
    public ResponseEntity<List<User>> addEmployee(@RequestBody User user, UriComponentsBuilder builder) {

      User newUser = employeeService.addEmployee(user.getCardId(), user.getFirstName(), user.getLastName(), user.getOrganization(), user.getShuttle().getShuttleId());
      if (newUser == null) {
        return new ResponseEntity<>(HttpStatus.CONFLICT);
      }
      HttpHeaders headers = new HttpHeaders();
      headers.setLocation(builder.path("userApi/user/{id}").buildAndExpand(newUser.getUserId()).toUri());
      List<User> users = employeeService.listEmployee();
      return new ResponseEntity<>(users, headers, HttpStatus.CREATED);
    }

    @PutMapping("user")
    public ResponseEntity<User> updateEmployee(@RequestBody User user) {
      employeeService.updateEmployee(user.getUserId(),user.getCardId(),user.getFirstName(),user.getLastName(),user.getOrganization(),user.getShuttle().getShuttleId());
      return new ResponseEntity<>(user, HttpStatus.OK);
    }

  @DeleteMapping("user/id/{id}")
  public ResponseEntity<Void> deleteUserById(@PathVariable("id") Integer id) {
    employeeService.deleteEmployee(id);
    return new ResponseEntity<>(HttpStatus.NO_CONTENT);
  }
 */

}
