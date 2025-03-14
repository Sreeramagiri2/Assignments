package constructor;
//constructor overloading
public class ParamDemo {
public ParamDemo()
{
	System.out.println("im default costructor");
}
public ParamDemo(int age)
{
	System.out.println("im param constructor:"+age);
}
public ParamDemo(String name,int age)
{
	System.out.println("my name is:"+name+"  my age is :"+age);
}
public static void main(String[] args) {
	ParamDemo pd=new ParamDemo();
	ParamDemo pd1=new ParamDemo(47);
	ParamDemo pd2=new ParamDemo("pavani",90);
	
}
}
