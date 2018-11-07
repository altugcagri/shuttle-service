package com.siemens.service.shuttle.services;

import com.siemens.service.shuttle.dao.ShuttleDao;
import com.siemens.service.shuttle.entity.Device;
import com.siemens.service.shuttle.entity.Shuttle;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

@Service
public class ShutterServiceImpl implements ShuttleService {

  @Autowired
  private ShuttleDao shuttleDao;

  @Override
  public Shuttle addShuttle(Device device, String routeName, String routeDescription, String plate) {
    if (!shuttleDao.listShuttle(device.getId()).isEmpty()) {
      return shuttleDao.listShuttle(device.getId()).get(0);
    }
    return shuttleDao.addShuttle(new Shuttle(plate, routeName, routeDescription, plate,device));
  }

  @Override
  public Shuttle updateShuttle(Device device, String routeName, String routeDescription, String plate) {
    Shuttle shuttle = new Shuttle();
    if (null != device && device.getId()!= shuttle.getDevice().getId()) {
      shuttle.setDevice(device);
    }

    if (!StringUtils.isEmpty(routeName) && !routeName.equals(shuttle.getRouteName())) {
      shuttle.setRouteName(routeName);
    }

    if (!StringUtils.isEmpty(routeDescription) && !routeDescription.equals(shuttle.getRouteDescription())) {
      shuttle.setRouteDescription(routeDescription);
    }

    if (!StringUtils.isEmpty(plate) && !plate.equals(shuttle.getPlate())) {
      shuttle.setPlate(plate);
    }

    return shuttleDao.updateShuttle(shuttle);
  }

  @Override
  public boolean deleteShuttle(long shuttleId) {
    Shuttle shuttle = shuttleDao.getShuttle(shuttleId);
    if (shuttle == null) {
      return false;
    }
    return shuttleDao.deleteShuttle(shuttle);
  }

  @Override
  public Shuttle getShuttle(long shuttleId) {
    return shuttleDao.getShuttle(shuttleId);
  }

  @Override
  public List<Shuttle> listShuttle() {
    return shuttleDao.listShuttle();
  }

  @Override
  public List<Shuttle> listShuttle(long deviceId) {
    return shuttleDao.listShuttle(deviceId);
  }
}
