package hw3Q2variableAndMethod;

public class TestComputer {
public static void main(String[] args) {
	Computer testComputer = new Computer();
	testComputer.brand = "Apple";
	testComputer.model = "MacBook Air";
	testComputer.operatingSystem = "MacOS Mojave";
	testComputer.price = 800;
	testComputer.madeInUsa = false;
	testComputer.configuration();
	
	System.out.println("---------------------------------------------------------------------------------------");
	
	Computer testComputer2 = new Computer();
	testComputer2.brand = "Dell";
	testComputer2.model = "Inspiron";
	testComputer2.operatingSystem = "Windows";
	testComputer2.price = 16000;
	testComputer2.madeInUsa = true;
	testComputer2.grade = 'A';
	testComputer2.configuration();
	
}
}
