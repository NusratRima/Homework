package hw9Q2Abstraction;

public abstract class MedcalSchool extends NursingSchool implements LawSchool{
	
	//abstract method
    public abstract void anatomyLab();
    
    //non-abstract method
    public void bioChemistry() {
    	
    	System.out.println("This is BioChemistry Department");
    }
    
}//21750
