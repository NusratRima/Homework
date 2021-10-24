package hw3Q3Constructor;

public class Computer {

    String brand;
	String model;
	String operatingSystem;
	int price;
	boolean madeInUsa;
	char grade;
//1
	public Computer() {
		System.out.println("This is from default Constructor of Computer class.");

	}
	//2
	public Computer(String brand, String model, String operatingSystem, int price, char grade, boolean madeInUsa) {
		this.brand = brand;
		this.model = model;
		this.operatingSystem = operatingSystem;
		this.price = price;
		this.madeInUsa = madeInUsa;
		this.grade = grade;

		System.out.println("My Brand: " + brand + "\nModel: " + model + "\nOperating system: " + operatingSystem
				+ "\nPrice: " + price + "\nGrade: " + grade + "\nMade in USA? " + madeInUsa);

	}
//3
	public Computer(String brand, String model, String operatingSystem, int price, boolean madeInUsa, char grade) {
		this.brand = brand;
		this.model = model;
		this.operatingSystem = operatingSystem;
		this.price = price;
		this.madeInUsa = madeInUsa;
		this.grade = grade;
		
		System.out.println("My Brand: " + brand + "\nModel: " + model + "\nOperating system: " + operatingSystem
				+ "\nPrice: " + price + "\nGrade: " + grade + "\nMade in USA? " + madeInUsa);

	}
	//4
	public Computer(String model) {
		this.model = model;
		
		System.out.println("Model =" +model );
}
	//5
	public Computer(String brand, String model, String operatingSystem) {

		this.brand = brand;
		this.model = model;
		this.operatingSystem = operatingSystem;
		
		System.out.println("My Brand: " + brand + "\nModel: " + model + "\nOperating system: " + operatingSystem);
	}
	//6
	public Computer(String brand, String model, String operatingSystem, int price, boolean madeInUsa) {

		this.brand = brand;
		this.model = model;
		this.operatingSystem = operatingSystem;
		this.price = price;
		this.madeInUsa = madeInUsa;
	
		System.out.println("My Brand: " + brand + "\nModel: "+ "\nOperating system: "+ operatingSystem +
				"\nPrice: "+ price + "\nMade In USA: "+ madeInUsa);
	
	}
	
	
	
	
	
	
	
	
	
	
}
//test
