

public class EmployeeCreation1 {
	private static int randnum = 1001;

	public static Employee1 createEmployee(String name, double salary, double exp,String job) {
		Employee1 e = new Employee1(randnum++, name, salary, exp,job);
		return e;
	}
}
