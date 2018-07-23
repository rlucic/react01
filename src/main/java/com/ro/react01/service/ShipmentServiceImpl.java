package com.ro.react01.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.ro.react01.model.Shipment;

@Service
public class ShipmentServiceImpl implements ShipmentService {

	private final Logger log = LoggerFactory.getLogger(ShipmentServiceImpl.class);
	
	@Override
	public void shipmentServiceUpdate(Shipment shipment) throws InterruptedException {
		// TODO Auto-generated method stub
		log.info("Shipment data: {}", shipment.toString());
		Thread.sleep(3000);
		log.info("Shipment data: {}, reached the destination.", shipment.toString());	}

}
