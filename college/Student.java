package org.college;

public class Student extends Department {
	public void studentName() {
		System.out.println("student name is Deepak");
	}
	public void studentDept()
	{
		System.out.println("student dept is CSE");
	}
	public void studentId()
	{
		System.out.println("studentID is 18CS015");
	}
	public static void main(String[] args) {
		Student details = new Student();
		details.collegeCode();
		details.collegeName();
		details.collegeRank();
		details.deptName();
		details.studentName();
		details.studentDept();
		details.studentId();
	}
}
