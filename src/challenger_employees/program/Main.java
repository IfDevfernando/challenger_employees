package challenger_employees.program;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import challenger_employees.entities.Address;
import challenger_employees.entities.Department;
import challenger_employees.entities.Employee;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("==============CHALLENGER EMPLOYEE===============");
		System.out.println();
		
		
		System.out.print("Name of Departmnet: ");
		String dep = sc.next();
		
		System.out.print("Day of payment: ");
		int day = sc.nextInt();
		System.out.print("Email: ");
		String email = sc.next();
		System.out.print("Phone number: ");
		String phone = sc.next();
		
		
		
		
		
		System.out.print("How many employees: ");
		int n = sc.nextInt();
		
		List<Employee> list = new ArrayList<>();
		
		
		for(int x=0;x < n; x++) {
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			
			
			Employee employee = new Employee(name, salary);
			
			
			
			list.add(employee);
			
			
			
		}
		
		Department dept = new Department(dep, day,new Address(email, phone),list);
		
		showReport(dept);
		
		
		
		sc.close();
	}
	
	private static void showReport(Department dept) {
		
		
		
		
		System.out.println("------------------ PAYROLL --------------------");
		System.out.println();
		System.out.print(dept.getName()+" Department - "+ dept.payroll());
		
		System.out.println(" Payment made on the day "+dept.getPayDay());
		System.out.println("Employees:");
		for(Employee em: dept.getEmployees()) {
			System.out.println(em.getName());
		}
		System.out.println("For questions, please contact: "+dept.getAddress().getEmail());
			
		
		
	}
	
	
	


}
