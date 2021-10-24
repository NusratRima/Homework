package hw3Q3Constructor;

public class TestComputer {
	
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


