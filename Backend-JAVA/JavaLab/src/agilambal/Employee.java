package agilambal;

public class Employee {
	String name;
	String jobtitle;
	double salary;
	public Employee(String name,String jobtitle,double salary) {
		this.name=name;
		this.jobtitle=jobtitle;
		this.salary=salary;
	}
	public String getname() {
		return name;
	}
	public void setname (String name) {
		this.name=name;
	}
	public String getjobtitle() {
		return jobtitle;
	}
	public void setjobtitle(String jobtitle) {
		this.jobtitle=jobtitle;
	}
	public double getsalary() {
		return salary;
	}
	public void setsalary(double salary) {
		this.salary=salary;
	}
	void display() {
		System.out.println("Employee Name: "+name);
		System.out.println("Employee Jobtitle: " +jobtitle);
		System.out.println("Employee Salary: "+salary);
	}
	public static void main(String[] args) {
		Employee emp = new Employee ("Mowni","Software engineer",40000);
		emp.display();
		emp.setname("Agila");
		emp.setjobtitle("Full Stack Developer");
		emp.setsalary(50000);
		
		System.out.println("Updated Data");
		System.out.println("Employee Name : "+emp.getname());
		System.out.println("Employee Jobtitle: "+emp.getjobtitle());
		System.out.println("Employee Salary: "+emp.getsalary());
	}
}
