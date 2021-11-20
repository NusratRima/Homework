package hw8Q3Abstraction;

public abstract class NursingSchool implements LawSchool{

	
	//abstract method
	public abstract void hygiene();
	
	//non-abstract method
	public void caring() {
	
		System.out.println("This is Caring Department");
	
}

}

/*ii) yes Abstract class inherit other abstract class or regular class by extends keywords
 * only one inheritance is possible by an abstract class*/
 