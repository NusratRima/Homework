package hw8Q2UseOfSuperInChildClass;

public class Father {
    public String fatherName;
    public int age;
    public char sex;
    public boolean usCitizen;
    public String familyName;
    
    //Default Constructor
    public Father() {
    	
    	System.out.println("This is a default constructor from Father class");
    }

    //Parameterized Constructor
	public Father(String fatherName, int age, char sex, boolean usCitizen) {
		this.fatherName = fatherName;
		this.age = age;
		this.sex = sex;
		this.usCitizen = usCitizen;
	   
		System.out.println("Father Name: "+ fatherName + "Father Age: "+ age + "Father Sex: " + sex + "He is a UsCitizen: " + usCitizen);
	
	}
	
    //Void Type Method or non parameterized method
	public void fatherInfo01() {
		System.out.println("This is a void type method from Father class");
	}
    
	//parameterized method
	public void fatherinfo02(String fatherName, int age, char sex, boolean usCitizen) {
		this.fatherName = fatherName;
		this.age = age;
		this.sex = sex;
		this.usCitizen = usCitizen;
	   
		System.out.println("Name: " + fatherName + "Father Age: " + age + "Father Sex: " + sex + "He is a UsCitizen: " + usCitizen);
	
	}
	
	
	
}
