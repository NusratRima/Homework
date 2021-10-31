package hw3Q4Constructor;

public class TestStudent {
public static void main(String[] args) {
	Student student1 = new Student();
	
	student1.myinfo("Sharmin", 623331, 'F', false, 3.654f);
	
	Student student2 = new Student("Nusrat", 623330, 'F', true, 3.976f);
}
}
