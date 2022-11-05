package org.student;

import org.department.Department;

public class Student extends Department{
	
	public void studentName() {
		System.out.println("Name of the student is student");
	}
	public void studentDept() {
		System.out.println("Name of the student department is Test student department");
	}
	public void studentId() {
		System.out.println("Id of the student is studentID");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student obj = new Student();
		System.out.println("College class:");
		obj.collegeName();
		obj.collegeCode();
		obj.collegeRank();
		System.out.println("");
		System.out.println("Department class:");
		obj.deptName();
		System.out.println("");
		System.out.println("Student class:");
		obj.studentName();
		obj.studentDept();
		obj.studentId();
	}

}
