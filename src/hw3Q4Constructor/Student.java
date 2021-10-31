package hw3Q4Constructor;

public class Student {

	//. Declare some variable -- StName, stID, sex, programmer(as boolean), grade (as float). Declare default constructor and only one parameterized constructor. Use only one System.out.println() in parameterized constructor to declare the above variables. Also, create a parameterized method with all the variables. Create another class TestStudent. Create object as many as you want under the main method. Initialize constructors. I want the first outcome in the console as --> This is from default Constructor of Student class. The second outcome -- > Student Name: <your name>, ID: <your id>, Sex: <your sex in char>, Grade = 3.976 and Java Programmer? Ans: true. Also, initialize the parameterized method and see the outcome. 
	
	public String StName;
	public int stID;
	public char sex;
	public boolean programmer;
	public float grade;
	
	
	public Student() {
		System.out.println("This is from default Constructor of Student class"+"\n....................");
	}
	public void myinfo(String stname, int stID, char sex, boolean programmer, float grade) {
		
		StName = stname;
		this.stID = stID;
		this.sex = sex;
		this.programmer = programmer;
		this.grade = grade;
		
		System.out.println("Student Name: " +StName+ "\nID: " +stID+ "\nSex: " +sex+"\nGrade: " +grade+"\nProgrammer: "+programmer + "\n.............................................");
		
	}


	public Student(String stName, int stID, char sex, boolean programmer, float grade) {
		
		StName = stName;
		this.stID = stID;
		this.sex = sex;
		this.programmer = programmer;
		this.grade = grade;
		
		System.out.println("Student Name: " +StName+ "\nID: " +stID+ "\nSex: " +sex+"\nGrade: " +grade+"\nProgrammer: "+programmer +"\n..............................................");
	}
	
	
}
