package hw2Q2JavaVariables;

public class TestAboutUs {

	public static void main(String[] args) {
		AboutUs test = new AboutUs(); //default constructor initialized
		//variable initialized below
		test.MyName = "Nusrat";      
		test.myAge = 45;
		test.myHouseRent = 30000;
		test.myYearlySalary = 250000;
		test.myBankBalance = 763846990;
		test.mySex = 'F';
		test.myHeight = 1.60f;
		test.myGrade = 3.496;
		test.usCitizen = true;
		test.aboutUs();    //method initialized
		
System.out.println("-------------------------------------------------------------------------");
	    
        AboutUs test2 = new AboutUs();
        // variable initialized below
        test2.MyName = "Alex";
		test2.myAge = 48;
		test2.myHouseRent = 31000;
		test2.myYearlySalary = 256000;
		test2.myBankBalance = 897946990;
		test2.mySex = 'M';
		test2.myHeight = 1.67f;
		test2.myGrade = 3.3236;
		test2.usCitizen = false;
	    test2.aboutUs();      //method initialized
	
	
	}

}
