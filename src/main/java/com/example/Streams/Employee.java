package com.example.Streams;

import java.util.stream.Collectors;
import java.util.*;

public class Employee {
	public int id;
	public String name;
	public String dept;
	public double salary;
	

	public Employee(int id, String name, String dept, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dept=" + dept + ", salary=" + salary + "]";
	}



	public static void main(String[] args) {
		
		List<Employee> emp=Arrays.asList(new Employee(1, "Alice", "IT", 85000),
			    new Employee(2, "Bob", "Finance", 92000),
			    new Employee(3, "Charlie", "IT", 105000),
			    new Employee(4, "David", "HR", 78000),
			    new Employee(5, "Eve", "HR", 88000),
			    new Employee(6, "Frank", "IT", 67000));
		
//		emp.stream().filter(p->p.salary>80000).forEach(p->System.out.println(p.salary));
//		
//		List<Employee> em=emp.stream().filter(p->p.dept.equalsIgnoreCase("IT")).collect(Collectors.toList());
//		
//		System.out.println("IT Employee :"+em);
		
//		List<String> e=emp.stream().filter(p->p.salary>=80000).map(p->p.name).collect(Collectors.toList());
//		System.out.println("Names are :"+e);
//		
//		Map<Integer,String> mp=emp.stream().filter(p->p.dept.equalsIgnoreCase("hr")).collect(Collectors.toMap(p->p.id, p->p.name));
//		System.out.println("The map is :"+mp);
		
//		long c=emp.stream().map(p->p.name).sorted().filter(p->p.length()>=5).count();
//		System.out.println(c);
		
//		List<String> li=emp.stream().map(p->p.name).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
//		System.out.println("The sorted names are :"+li);
//		
//		List<String> Ali=emp.stream().map(p->p.name).sorted().collect(Collectors.toList());
//		System.out.println("The sorted names are :"+Ali);
		
//		double d= emp.stream().filter(p->p.dept.equalsIgnoreCase("it")).mapToDouble(p->p.salary).average().orElse(0.0);
//		System.out.println("Avg is :"+d);
//		
//		boolean check=emp.stream().anyMatch(p->p.salary >100000);
//		System.out.println(check);
//		
//		List<Double> in=emp.stream().map(p->p.salary).sorted(Comparator.reverseOrder()).limit(3).collect(Collectors.toList());
//		System.out.println(in);
		
		
		
		

	}

}
