package raman_java;

import java.util.Scanner;

public class calculator_switch_statement { 
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a,b,c,d;
		System.out.println("Enter any two numbers");
		Scanner s=new Scanner(System.in);
		a=s.nextInt();
		b=s.nextInt();
		System.out.println("Enter your choice");
		d=s.nextInt();
		
		
		switch(d) {
		case 1:c=a+b;
		System.out.println("Additional: " +c);
		break;
		
		case 2:c=a-b;
		System.out.println("Substraction: " +c);
		break;
		
		case 3:c=a*b;
		System.out.println("Multiplication: " +c);
		break;
		
		case 4:c=a/b;
		System.out.println("Division: " +c);
		break;
		
		case 5:c=a%b;
		System.out.println("Remainder: " +c);
		break;
		
		default:
			System.out.println("INvalid Choice");
		
		}

	}

}
