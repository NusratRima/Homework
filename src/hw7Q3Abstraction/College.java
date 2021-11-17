package hw7Q3Abstraction;


public interface College {

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
