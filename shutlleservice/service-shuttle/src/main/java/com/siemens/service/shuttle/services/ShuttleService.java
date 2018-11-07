package com.siemens.service.shuttle.services;


import com.siemens.service.shuttle.entity.Device;
import com.siemens.service.shuttle.entity.Shuttle;
import java.util.List;


public interface ShuttleService {

  Shuttle addShuttle(Device device, String routeName, String routeDescription, String plate);

  Shuttle updateShuttle(Device device, String routeName, String routeDescription, String plate);

  boolean deleteShuttle(long shuttleId);

  Shuttle getShuttle(long shuttleId);

  List<Shuttle> listShuttle();

  List<Shuttle> listShuttle(long deviceId);

}
