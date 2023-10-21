package com.org.sbms;

public class EmployeeDetails {
	
	int emp_id;
	double salary;  
	String name, address, department, email;
	
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public EmployeeDetails(int emp_id, int salary, String name, String address, String department, String email) {
		super();
		this.emp_id = emp_id;
		this.salary = salary;
		this.name = name;
		this.address = address;
		this.department = department;
		this.email = email;
	}
	@Override
	public String toString() {
		return "EmployeeDetails [emp_id=" + emp_id + ", salary=" + salary + ", name=" + name + ", address=" + address
				+ ", department=" + department + ", email=" + email + "]";
	}  
	
	

}
