
import java.util.ArrayList;
import java.util.Collections;

public class Company1 {
	String name;
	String address;
	private ArrayList<Employee1> empList = new ArrayList<Employee1>();

	public Company1(String name, String address) {
		this.name = name;
		this.address = address;
	}

	public String getName() {
		return this.name;
	}

	public String getAddress() {
		return this.address;
	}

	// javaDocs
	/**
	 * This method is used to add employee to the memory(ArrayList)
	 */
	public void addEmployee(Employee1 e) {
		empList.add(e);
	}

	/**
	 * this method is used to search an employee based on id if found, returns the
	 * reference otherwise return null
	 * 
	 * @param id of the employee to be search
	 * @return Employee object username
	 */
	public Employee1 searchEmployee(int id) {
		Employee1 emp = null;
		for (Employee1 e : empList) {
			if (e.getId() == id) {
				emp = e;
				break;
			}
		}
		return emp;
	}
	/**
	 * this method is used to update salary based on id of the employee
	 * @param id of the employee
	 * @param salary to be update
	 */
	public void updateSalary(int id,double salary) {
		Employee1 foundemp=searchEmployee(id);
		if(foundemp!=null) {
			foundemp.setSalary(salary);
		}else {
			System.out.println("Employee by the given id not found in the records");
		}
	}
	/**
	 * this method is used to remove the Employee details from the list
	 * @param id of the Employee to be removed
	 */
	public void removeEmployee(int id) {
		Employee1 foundemp=searchEmployee(id);
		if(foundemp!=null) {
			empList.remove(foundemp);
		}else {
			System.out.println("Employee by the given id not found in the records");
		}
	}
	/**
	 * this method returns total no of Employees in the company
	 * @return int value which describes number of employee store in memory(ArrayList)
	 */
	public int getTotalEmployee() {
		return empList.size();
	}
	/**
	 * Below method is used to find maximum salary a employee is getting
	 */
	public void maxSal() {
		double max=0;
		for(Employee1 d:empList) {
			if(max<d.getSalary()) {
				max=d.getSalary();			
				}
		}
		System.out.println("max salaray of employee is:-"+max);
	}
	/**
	 * This method is used to fetch salary of employees either in 
	 * Ascending or descending order which will take order of sorting as input 
	 * either ASC or DESC (not case sensitive)
	 * @param order=Order of Sorting of result either ASC(ascending order) Or DESC(descending order)
	 */
	public void getEmpByOrderBysal(String order){
		order=order.toUpperCase();
		ArrayList a=new ArrayList();
		int i=0;		
		for(Employee1 e:empList) {
			a.add(e.getSalary());
			i++;
		}
		Collections.sort(a);
 		if(order.equals("ASC")) {
 			System.out.println(a);
		}else if(order.equals("DESC")){System.out.print("[");
			for(int j=a.size()-1;j>=0;j--) {
				System.out.print(a.get(j)+" ");
			}
			System.out.print("]");
		}
	}
	/**
	 * The method is used to get details of employee by their job
	 */
	public void getEmpByJob(String job) {
		if(empList.size()!=0) {
			for(Employee1 e:empList) {
				if(e.getJob().equals(job)) {
					System.out.println("======================================================================");
					System.out.println("Name: "+e.getName()+" job: "+e.getJob()+" Experiance:"+e.getExp());
					System.out.println("======================================================================");
				}
			}
			
		}else {
			System.err.println("Employee DB is empty");
		}
	}
	public void allDesignation() {
		System.out.println("======================================================================");
		if(empList.size()!=0) {
			System.out.println("Below are the all the designation of employees of the company");
			int max=empList.size();
			for(int i=0;i<max;i++) {
				System.out.println(empList.get(i).getJob());
			}
			
		}else {
			System.err.println("DataBase is empty");
		}
		System.out.println("======================================================================");
	}
	/**
	 * This method is used to display all the details of the Employee
	 */
	void viewAllEmployeeDetails() {
		System.out.println("---------------------------------------");
		System.out.println("Id\tName\tSalary\tExp");
		System.out.println("---------------------------------------");
		for(Employee1 e:empList) {
			System.out.println(e.getId()+"\t"+e.getName()+"\t"+e.getSalary()+"t"+e.getExp());
		}
	}
}
