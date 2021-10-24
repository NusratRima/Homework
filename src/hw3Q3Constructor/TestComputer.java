package hw3Q3Constructor;

public class TestComputer {
	/*Create another class TestComputer. Create object as many as you want under main method. Initialize all the constructors. I want in console, the first outcome as --> This is from default Constructor of Computer class. Second outcome as-- > My Brand: Apple, Model: MacBook Air, Operating system: MacOS Mojave, Price: 800$, Grade: C and Made in USA? Ans: false. I want the third outcome in console for your configuration. Fourth outcome for 1 variable, 5th outcome for 3 variable, 6th outcome for 5 variable. */
public static void main(String[] args) {
	Computer computer1= new Computer();
	System.out.println("-----------------------------------------------------------------------------------------");
	Computer computer2= new Computer("Apple", "MacBook Air", "MacOS Mojave", 800, 'C', false);
	System.out.println("---------------------------------------My Configuration------------------------------");
	Computer computer3= new Computer("Dell", "Insoiron", "Windows", 1600, true, 'A' );
	System.out.println("-----------------------------------------------------------------------------------------");
	Computer computer4= new Computer("XPS");
	System.out.println("-----------------------------------------------------------------------------------------");
	Computer computer5= new Computer("Apple", "MacBook Pro", "MacOS");
	System.out.println("-----------------------------------------------------------------------------------------");
	Computer computer6= new Computer("HP", "inspiron", "Windows", 650, true);
	
}


}


