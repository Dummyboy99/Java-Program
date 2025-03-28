package com.jsp;

class Employee implements Comparable<Employee>{
	String s;
	int age;
	int sal;
	public Employee(String s, int age,int sal) {
		this.s = s;
		this.age = age;
		this.sal=sal;
	}
	@Override
	public String toString() {
		return "Emp [s=" + s + ", age=" + age  + ",sal="+sal+ "]";
	}
	@Override
	public int compareTo(Employee o) {
		return this.age-o.age;
	}
}

