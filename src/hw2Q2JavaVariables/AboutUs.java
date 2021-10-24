package hw2Q2JavaVariables;

public class AboutUs {
   //variable declared below
	public String MyName;
	public byte myAge;
	public short myHouseRent;
	public int myYearlySalary; 
	public long myBankBalance;
	public char mySex;
	public float myHeight;
	public double myGrade;
	public boolean usCitizen;

	public AboutUs() {
		System.out.println("This is all about me");
	}

public void aboutUs() { //method has been implemented
   System.out.println("My Name is = "+MyName
		   +"\nMy age is = "+myAge +"\nMy house rent = "+myHouseRent+"\nMy  Yearly Salary = "+myYearlySalary +"\nMy Bank Balance = "+myBankBalance + "\nMy sex = "+mySex + "\nMy Height = "+myHeight + "\nMy Grade =" +myGrade +"\nI am a US citizen = "+usCitizen);
}
}