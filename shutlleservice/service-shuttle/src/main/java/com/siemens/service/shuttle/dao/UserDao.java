package com.siemens.service.shuttle.dao;

import com.siemens.service.shuttle.entity.User;
import java.util.List;

public interface UserDao {

  User addUser(User user);

  User updateUser(User user);

  boolean deleteUser(User user);

  User getUser(long userId);

  List<User> listUser();

  //List<User> listEmployee(String cardId);

}
