package com.Strings;

public class Demo {
	public static void main(String[] args) {
		String name="Capgemini";
		String name1="Capgemini";
		String result=name.concat("india");//string is immutable
		System.out.println(result);
		/*name.concat("india");
		System.out.println(name);
		*/
		System.out.println(name.equals(name1));//t
		System.out.println(name==name1);//f,t
	}

}
