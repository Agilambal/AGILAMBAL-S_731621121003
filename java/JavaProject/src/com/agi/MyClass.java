package com.agi;

//class and object
class Employee {
	//Variables
	int employeeId;
	String employeeName;
	float employeeSalary;
	
	//constructor

		Employee(int employeeId,String employeeName,float employeeSalary){
		this.employeeId=employeeId;
		this.employeeName=employeeName;
		this.employeeSalary=employeeSalary;
	}
	
	private void Employee() {
		// TODO Auto-generated method stub
		
	}

	//Method 
	void display() {
		System.out.println("Employee Id :"+employeeId);
		System.out.println("Employee Name :"+employeeName);
		System.out.println("Employee Salary :"+employeeSalary);
	}
}
public class MyClass {
	public static void main(String args[])
	{
		Employee emp1=new Employee(003,"Agi",5000.0f);
		emp1.display();
		Employee emp2=new Employee(004,"Mowni",6000.0f);
		emp2.display();
		
	}

}
