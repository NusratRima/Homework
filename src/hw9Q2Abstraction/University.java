package hw9Q2Abstraction;


//this is an interface
public interface University extends College, Hospital  {
      
	
	   public void classSize();
	   public void playGround();
	   public void teacher();

	   public default void gymnasium() {
		   System.out.println("This is Gymnasium");
	   }
       public static void library() {
    	   System.out.println("This is Library");
       }
}

/*3-2) i) More than one
 * An Interface inherit other interfaces, but can not inherit a regular class or abstract class by extends key word
 * only one inheritance is possible*/
