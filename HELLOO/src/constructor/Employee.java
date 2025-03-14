package constructor;
//with constructor
public class Employee {
	int empid;
	String empname;
	public Employee()
	{
		empid=345;
		empname="pavani";
	}
	public void display()
	{
		System.out.println(empid+" "+empname);
	}
	public static void main(String[] args) {
		Employee emp=new Employee();
		emp.display();
	}
}
