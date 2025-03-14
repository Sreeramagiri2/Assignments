package com.demo;
import java.util.Scanner;
public class Add {
	public static void main(String[] args) {
		Scanner sc = new  Scanner ("System.in");
		System.out.println("enter first input");
		String a=sc.next();
		System.out.println("enter second input");
		String b=sc.next();
		String c=a+b;
		System.out.println("result is:"+c);
	
	}

}
