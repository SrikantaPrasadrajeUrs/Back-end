

import java.util.Scanner;

public class AppLauncher1 {
	private Company1 com = new Company1("Company1", "BTM Bengaluru");
	private Scanner scan = new Scanner(System.in);

	public void menuItems() {
		System.out.println("Welcome to" + com.getName() + "Company");
		System.out.println("Options ");
		System.out.println("------------------------------------");
		System.out.println("Select 1 to add new employee");
		System.out.println("Select 2 to veiw employee details");
		System.out.println("Select 3 to search employee by id");
		System.out.println("Select 4 to update employee salary");
		System.out.println("Select 5 to delete employee salary");
		System.out.println("Select 6 to veiw employee record");
		System.out.println("Select 6 to get number of employees in Database");
		System.out.println("Select 7 to get max sal of emp");
		System.out.println("Select 8 to get sal either in ascending or decending order of emp");
		System.out.println("Select 9 to get all the employee by particular job");
		System.out.println("Select 10 to veiw all designation of employee");
		System.out.println("Select 11 to exit from app");
		System.out.println("-------------------------------------");

	}

	public void launch() {
		while (true) {
			menuItems();
			int choice = scan.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter employee name");
				String name = scan.next();
				System.out.println("Enter employee salary");
				double salary = scan.nextDouble();
				System.out.println("Enter employee experiance");
				double exp = scan.nextDouble();
				System.out.println("Enter employee job-role");
				String job=scan.next();
				job=job.toLowerCase();
				Employee1 e = EmployeeCreation1.createEmployee(name, salary, exp,job);
				com.addEmployee(e);
				System.out.println("Add Employee succsfully");
				break;
			case 2:
				com.viewAllEmployeeDetails();
				break;
			case 3:
				System.out.println("enter employee id");
				int id = scan.nextInt();
				Employee1 emp = com.searchEmployee(id);
				System.out.println(emp.getId() + " " + emp.getName() + " " + emp.getSalary() + " " + emp.getExp());
			case 4:
				System.out.println("Enter employee id");
				int eid = scan.nextInt();
				System.out.println("Enter new salary");
				double newSalary = scan.nextDouble();
				com.updateSalary(eid, newSalary);
				break;
			case 5:
				System.out.println("Enter employee id");
				int empid = scan.nextInt();
				com.removeEmployee(empid);
				break;
			case 6:
				System.out.println("Total Employee: " + com.getTotalEmployee());
				break;
			case 7:
				com.maxSal();
				break;
			case 8:
				System.out.println("enter the order in which you want to sal of all the employee either ASC or DESC");
				String s=scan.next();
				com.getEmpByOrderBysal(s);
				break;
			case 9:
				System.out.println("Enter designation name");
				String job1=scan.next();
				com.getEmpByJob(job1);
				break;
			case 10:
				com.allDesignation();
				break;
			case 11:
				System.out.println("Thankyou for using the app");
				System.exit(0);
			default:
				System.out.println();
				menuItems();

			}
		}
	}
	
}
