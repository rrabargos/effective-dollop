package com.crocell.vuespringshop.service;

import com.crocell.vuespringshop.model.Device;

import java.util.List;

public interface DeviceService {
  Device saveDevice(Device device);

  void deleteDevice(Long id);

  List<Device> findAllDevices();
}
