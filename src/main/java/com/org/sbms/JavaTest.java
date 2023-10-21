package com.org.sbms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class JavaTest {
	
	public static void main(String[] args) {
		
		List<EmployeeDetails> listofemployees=new ArrayList<EmployeeDetails>();
		
		EmployeeDetails e1=new EmployeeDetails(101,4500000,"Ishaan Agasthya","hyderabad","QA","eeshaanagasthya@google.com");
		EmployeeDetails e2=new EmployeeDetails(102,5400000,"Naga Skandha","hyderabad","Developer","shanmukhaskansha@bmw.com");
		EmployeeDetails e3=new EmployeeDetails(103,3600000,"Samudhyatha","hyderabad","Developer","samudhyatha@kirloskar.com");
		EmployeeDetails e4=new EmployeeDetails(104,3300000,"Adithri","hyderabad","QA","adithri@kpmg.com");
		EmployeeDetails e5=new EmployeeDetails(105,4100000,"Abhighna","hyderabad","QA","abhighastronaut@dhruva.com");
		EmployeeDetails e6=new EmployeeDetails(106,4000000,"Kritik","hyderabad","Developer","Kritikxlnt@indiainsurance.com");
		EmployeeDetails e7=new EmployeeDetails(107,4000000,"Ritik","hyderabad","Developer","Ritikmarvel@banking.com");
		EmployeeDetails e8=new EmployeeDetails(108,4100000,"Pramukh","hyderabad","QA","pramukhmaharaaj@honda.com");
		EmployeeDetails e9=new EmployeeDetails(109,9900000,"SSKPC SwamyNathan ","hyderabad","Developer","superintelligent@universe.com");
		 
		Collections.addAll(listofemployees, e1,e2,e3,e4,e5,e6,e7,e8,e9);
		
		/*
		 * //To find Department name and employees working in the department
		 * listofemployees.stream().collect(Collectors.groupingBy(e->e.getDepartment(),
		 * Collectors.mapping(e->e.getName(), Collectors.toList())))
		 * .entrySet().stream().forEach(System.out::println);
		 * 
		 * //To find number of employees working in each department
		 * listofemployees.stream().collect(Collectors.groupingBy(e->e.getDepartment(),
		 * Collectors.counting())).entrySet().stream().forEach(System.out::println);
		 * 
		 * listofemployees.stream().collect(Collectors.groupingBy(e->e.getDepartment(),
		 * Collectors.maxBy((o1,o2)->o1.getSalary()>o2.getSalary()?1:-1)))
		 * .entrySet().stream().forEach(System.out::println);
		 *
		 */
		
      Comparator<EmployeeDetails> bySalary=Comparator.comparing(EmployeeDetails::getSalary);
      
      
      listofemployees.stream().collect(Collectors.groupingBy(e->e.getDepartment(), Collectors.reducing(BinaryOperator.maxBy(bySalary))))
                     .entrySet().stream().forEach(System.out::println);

      
      
      
	}
}