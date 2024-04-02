package challenger_employees.entities;

import java.util.ArrayList;
import java.util.List;

public class Department {
	
	private String name;
	private int payDay;
	
	List<Employee> employees = new ArrayList<>();
	
	private Address address;
	
	
	
	

	public Department(String name, int payDay,Address address,List<Employee> employees) {
		
		this.address = address;
		this.name = name;
		this.payDay = payDay;
		this.employees = employees;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getPayDay() {
		return payDay;
	}



	public void setPayDay(int payDay) {
		this.payDay = payDay;
	}
	
	public Address getAddress() {
		return address;
	}



	public void setAddress(Address address) {
		this.address = address;
	}



	public List<Employee> getEmployees() {
		return employees;
	}
	
	public void addEmployee(Employee employee) {
		
		employees.add(employee);
		
	}
	public void removeEmployee(Employee employee) {
		employees.remove(employee);
	}
	
	public double payroll() {
		double salaryTotal = 0.0;
		
		for(Employee em: employees) {
			salaryTotal += em.getSalary();
		}
		
		return salaryTotal;
	}



	

	

}
