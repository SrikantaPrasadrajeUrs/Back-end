

public class Employee1 {
	private String name;
	private int id;
	private double salary;
	private double exp;
	private String job;

	public Employee1(int id, String name, double salary, double exp,String job) {
		this.name = name;
		this.id = id;
		this.salary = salary;
		this.exp = exp;
		this.job=job;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getExp() {
		return exp;
	}

	public void setExp(double exp) {
		this.exp = exp;
	}

	@Override
	public String toString() {
		return "Employee1 [name=" + name + ", id=" + id + ", salary=" + salary + ", exp=" + exp + "]";
	}
}
