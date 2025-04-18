package com.Servlet1;

public class Student {
		
		 int rollNo;
		String name;
		


	public Student(int roll,String name) {
		
		this.rollNo=roll;
		this.name=name;
		
	}



	public int getRollNo() {
		return rollNo;
	}



	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + "]";
	}
	
	

}
