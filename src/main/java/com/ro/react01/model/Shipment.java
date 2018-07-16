package com.ro.react01.model;

public class Shipment {

    private String shipmentId;
    private String name;
    private String currentLocation;
    private String deliveryAddress;
    private String status;

    public Shipment(){}

    
	public Shipment(String shipmentId, String name, String currentLocation, String deliveryAddress, String status) {
		super();
		this.shipmentId = shipmentId;
		this.name = name;
		this.currentLocation = currentLocation;
		this.deliveryAddress = deliveryAddress;
		this.status = status;
	}


	public String getShipmentId() {
		return shipmentId;
	}

	public void setShipmentId(String shipmentId) {
		this.shipmentId = shipmentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCurrentLocation() {
		return currentLocation;
	}

	public void setCurrentLocation(String currentLocation) {
		this.currentLocation = currentLocation;
	}

	public String getDeliveryAddress() {
		return deliveryAddress;
	}

	public void setDeliveryAddress(String deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}


	@Override
	public String toString() {
		return "Shipment [shipmentId=" + shipmentId + ", name=" + name + ", currentLocation=" + currentLocation
				+ ", deliveryAddress=" + deliveryAddress + ", status=" + status + "]";
	}
    
    
}
