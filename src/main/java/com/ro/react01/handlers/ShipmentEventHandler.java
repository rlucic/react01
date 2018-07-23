package com.ro.react01.handlers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ro.react01.model.Shipment;
import com.ro.react01.service.ShipmentService;
import reactor.bus.Event;
import reactor.fn.Consumer;



@Service
public class ShipmentEventHandler implements Consumer<Event<Shipment>>{

	private final ShipmentService shipmentService;
	
	@Autowired
	public ShipmentEventHandler(ShipmentService shipmentService){
		this.shipmentService = shipmentService;
	}

	@Override
	public void accept(Event<Shipment> shipmentEvent) {
		Shipment shipment = shipmentEvent.getData();
		
		try {
			shipmentService.shipmentServiceUpdate(shipment);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
