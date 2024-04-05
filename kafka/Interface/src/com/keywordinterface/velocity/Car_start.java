package com.keywordinterface.velocity;

public class Car_start {

	public static void main(String[] args) {
		Car tesla = new ElectricCar();
		Car mercedes = new DieselCar();
		tesla.start();
		mercedes.start();
		tesla.colour();
		mercedes.colour();
 

	}

}
