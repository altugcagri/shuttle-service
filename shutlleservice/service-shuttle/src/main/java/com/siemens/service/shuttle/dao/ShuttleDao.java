package com.siemens.service.shuttle.dao;


import com.siemens.service.shuttle.entity.Shuttle;
import java.util.List;

public interface ShuttleDao {

  Shuttle addShuttle(Shuttle shuttle);

  Shuttle updateShuttle(Shuttle shuttle);

  boolean deleteShuttle(Shuttle shuttle);

  Shuttle getShuttle(long shuttleId);

  List<Shuttle> listShuttle();

  List<Shuttle> listShuttle(long deviceId);

}
