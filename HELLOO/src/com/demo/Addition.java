package com.demo;

import java.util.Scanner;

public class Addition {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter 1st ");
		String a=sc.next();
		System.out.println("enter 2nd");
		String b=sc.next();
		String c=a+b;
		System.out.println("result is:"+c);
	}


}
