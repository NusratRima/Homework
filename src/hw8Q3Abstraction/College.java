package hw8Q3Abstraction;


public interface College extends Hospital{

	//can not create constructor inside interface
	public void commonRoom();
	public void laboratory();
	public void languageClub();
	
	public default void dorm() {
		System.out.println("This is Dorm");
	}
    public static void studyRoom() {
    	System.out.println("This is StudyRoom");
    }
}
//3-1) ii) only abstract keywords used
//