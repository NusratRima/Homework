package hw8Q2UseOfSuperInChildClass;

public class Daughter extends Father {
  public String birthMonthString;
  public int age;
  
  //default constructor
  public Daughter() {
	  super();
	  System.out.println(" this is a default constructor from Daughter class");
  }
  //parameterized constructor
  public Daughter(String birthMonthString, int age) {
	this.birthMonthString = birthMonthString;
	this.age = age;
     System.out.println("BirthMonth: " + birthMonthString + "Daughter Age: " + age);
}
  //regular method
  public void daughterInfo01() {
	System.out.println("This is a method from Daughter class");
}
  //parameterized method
  public void daughterInfo02(String birthMonthString, int age) {
		this.birthMonthString = birthMonthString;
		this.age = age;
	     System.out.println("BirthMonth: " + birthMonthString + "Daughter Age: " + age);
	}
public void Daughter1(String string, int i) {
	// TODO Auto-generated method stub
	
}
	  
  }

