package raman_java;

import java.util.Scanner;

public class fggfg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		float a = 2;
//		float b = 5;
//		float g = 3;
//		double c;
//		
//		c=a*b/g;
//		System.out.println("RESULT = " +c);
//		
//		System.out.println(10+30); 
//		System.out.println("sandeep"+"rajeev"); 
//		System.out.println(10 +"sandeep"+"rajeev"+10+30);
//		System.out.println(10+30 +"sandeep"+"rajeev"+10);
//		System.out.println("10+30" +"sandeep"+12+20+"rajeev"+10);
//
//	}
		
		int[] i=new int[10]; 
		System.out.println(i.length);
		
		for (int a=0;a<=i.length-1;a++) {
			
			System.out.println(" enter value : ");
			Scanner sc= new Scanner(System.in);
			int b= sc.nextInt();
			i[a]=b;
			
		}
		
		for (int a=0;a<=i.length-1;a++) {
			
			System.out.println(i[a]);
			
		}
	}

}
