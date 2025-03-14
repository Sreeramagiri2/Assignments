package constructor;
//without constructor
public class Student {
int studentId;
String studentName;

public void assign() 
{
studentId=789;
studentName="bahubali";
}
public void display() 
{
	System.out.println(studentId+" "+studentName);

}

	

public static void main(String[] args) {

	Student st=new Student();
	//st.assign(};//explicitly calling of methods
	st.display();
}
}