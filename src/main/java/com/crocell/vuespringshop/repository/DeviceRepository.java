package com.crocell.vuespringshop.repository;

import com.crocell.vuespringshop.model.Device;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeviceRepository extends JpaRepository<Device, Long> {

}
