package hw8Q3Abstraction;

public interface Hospital {

	
	   public void emergencyRoom();
	   public void surgeryRoom();
	   public void cafeteria();
	   
	   public default void morgue() {
		   System.out.println("This is Morgue");
	   }
      public static void pharmacy() {
    	  System.out.println("This is Pharmacy");
      }
}
