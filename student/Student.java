package org.student;

import org.department.Department;

public class Student extends Department {
	
	public void studentName()
	{
		System.out.println("Student name : Anushya");
	}
	public void studentDept()
	{
		System.out.println("StudentDept name : Mechatronics");
	}
	public void studentId()
	{
		System.out.println("studentId : 12345");
	}
	
	
	public static void main(String[] args) {

	Student s = new Student();
	
	s.collegeCode();
	s.collegeName();
	s.collegeRank();
	s.deptName();
	s.studentDept();
	s.studentId();
	s.studentName();

	
	
	}}
