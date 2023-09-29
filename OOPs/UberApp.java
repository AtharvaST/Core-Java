class Uber {
	private String carType;
	private double baseFare;

	public Uber(String carType, double baseFare) {
		this.carType = carType;
		this.baseFare = baseFare;
	}

	public String getCarType() {
		return carType;
	}

	public double getBaseFare() {
		return baseFare;
	}

	public double calculateFare(double distance) {
		// Basic fare calculation based on distance
		return baseFare * distance;
	}

	public void displayFareDetails(double distance, double fare) {
		System.out.println("Car Type: " + carType);
		System.out.println("Distance: " + distance + " km");
		System.out.println("Total Fare: $" + fare);
	}
}

class Auto extends Uber {
	public Auto() {
		super("Auto", 3.0); // Auto base fare and car type
	}
}

class Sedan extends Uber {
	public Sedan() {
		super("Sedan", 5.0); // Sedan base fare and car type
	}
}

class SUV extends Uber {
	public SUV() {
		super("SUV", 7.0); // SUV base fare and car type
	}
}

class Prime extends Uber {
	public Prime() {
		super("Prime", 9.0); // Prime base fare and car type
	}
}

public class UberApp {
	public static void main(String[] args) {
		double distance = 10.5; // Sample distance for fare calculation

		Uber auto = new Auto();
		double autoFare = auto.calculateFare(distance);
		auto.displayFareDetails(distance, autoFare);

		System.out.println();

		Uber sedan = new Sedan();
		double sedanFare = sedan.calculateFare(distance);
		sedan.displayFareDetails(distance, sedanFare);

		System.out.println();

		Uber suv = new SUV();
		double suvFare = suv.calculateFare(distance);
		suv.displayFareDetails(distance, suvFare);

		System.out.println();

		Uber prime = new Prime();
		double primeFare = prime.calculateFare(distance);
		prime.displayFareDetails(distance, primeFare);
	}
}
