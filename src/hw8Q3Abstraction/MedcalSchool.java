package hw8Q3Abstraction;

public abstract class MedcalSchool extends NursingSchool{
	
	//abstract method
    public abstract void anatomyLab();
    
    //non-abstract method
    public void bioChemistry() {
    	
    	System.out.println("This is BioChemistry Department");
    }
    
}
