package com.crocell.vuespringshop.controller;

import com.crocell.vuespringshop.model.Device;
import com.crocell.vuespringshop.service.DeviceService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/device") //pre-path
public class DeviceController {

  private final DeviceService deviceService;

  @PostMapping //will look like: api/device
  public ResponseEntity<?> saveDevice(@RequestBody Device device) {
    return new ResponseEntity<>(deviceService.saveDevice(device), HttpStatus.CREATED);
  }

  @DeleteMapping("{deviceId}") //will look like: api/device/{deviceId}
  public ResponseEntity<?> deleteDevice(@PathVariable Long deviceId) {
    deviceService.deleteDevice(deviceId);
    return new ResponseEntity<>(HttpStatus.OK);
  }

  @GetMapping //will look like: api/device, will be fine as it is for GET method
  public ResponseEntity<?> getAllDevices(){
      return new ResponseEntity<>(deviceService.findAllDevices(), HttpStatus.OK);
  }
}
