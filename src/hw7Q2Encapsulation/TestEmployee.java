package hw7Q2Encapsulation;

public class TestEmployee {

	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.setEmpName("Nancy");
		employee.setAge(30);
		employee.setSex('F');
		employee.setUsCitizen(true);

		System.out.println("Name: " + employee.getEmpName() + "\nAge: " + employee.getAge() + "\nSex: "
				+ employee.getSex() + "\nUs Citizen: " + employee.isUsCitizen());
	}

}
