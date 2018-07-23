package com.ro.react01;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ro.react01.handlers.ShipmentEventHandler;
import com.ro.react01.model.Shipment;

import reactor.bus.Event;
import reactor.bus.EventBus;
import reactor.bus.selector.Selector;

import static reactor.bus.selector.Selectors.$;

@SpringBootApplication
public class React01Application implements CommandLineRunner 
// can also use ApplicationRunner
{

	private final Logger logger = LoggerFactory.getLogger("React01Application");
	private final EventBus eventBus;
	private final ShipmentEventHandler shipmentEventHandler;
	
	public React01Application(EventBus eventBus, ShipmentEventHandler shipmentEventHandler){
		this.eventBus = eventBus;
		this.shipmentEventHandler = shipmentEventHandler;
	}
	
	public static void main(String[] args) {
		System.out.println("---> Before run(.....)");
		SpringApplication.run(React01Application.class, args);
		System.out.println("---> After run(.....)");		
	}

	@Override
	public void run(String... arg0) throws Exception {
		logger.info("arguments --> " + Arrays.toString(arg0));
		eventBus.on($("shipmentEventHandler"), shipmentEventHandler);
		
		for(int i=0; i<10; i++){
			Shipment shipment = new Shipment();
			shipment.setShipmentId(String.valueOf(i));
			eventBus.notify("shipmentEventHandler", Event.wrap(shipment));
			logger.info("Published shipment number {}.", i);
		}
	}
	
	
}
