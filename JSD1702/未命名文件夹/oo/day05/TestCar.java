package oo.day05;



	abstract class Vehicle {
	    public int speed() {
	        return 0;
	    }
	}
	class Car extends Vehicle {
	    public int speed() {
	        return 60;
	    }
	}
	class RaceCar extends Car {
	    public int speed() {
	        return 150;
	    }
	}
	public class TestCar {
	    public static void main(String[] args) {
	        RaceCar racer = new RaceCar();
	        Car car = new RaceCar();
	        Vehicle vehicle = new RaceCar();
	        System.out.println(racer.speed() + ", " + car.speed() + ", "
	        + vehicle.speed());
	    }
	}