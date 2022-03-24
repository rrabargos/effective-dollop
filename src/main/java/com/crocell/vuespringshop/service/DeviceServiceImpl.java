package com.crocell.vuespringshop.service;

import com.crocell.vuespringshop.model.Device;
import com.crocell.vuespringshop.repository.DeviceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class DeviceServiceImpl implements DeviceService {

  private final DeviceRepository deviceRepository;

  @Override
  public Device saveDevice(Device device){
    device.setCreateTime(LocalDateTime.now());

    return deviceRepository.save(device);
  }

  @Override
  public void deleteDevice(Long id){
    deviceRepository.deleteById(id);
  }

  @Override
  public List<Device> findAllDevices(){
    return deviceRepository.findAll();
  }
}
