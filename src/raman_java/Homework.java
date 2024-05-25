package raman_java;

import java.util.Scanner;

public class Homework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int i;
//	
//		for(i=0;i<=100;i=i+2) {
//			
//		System.out.println("Even number: " +i);
//		}
//		
//		
//		
		
		
		
//		[For Each Loop for printing array values]
		
//		int[] a={10,20,30,40};
//		System.out.println("length: "+a.length);
//		for (int a1:a)
//		{
//		System.out.println(a1);
//		}
		
		
int[] a=new int[5];
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("enter values");
		
		for (int i=0;i<a.length;i++)
		{
			System.out.println("enter "+i+" value");
			a[i]=s.nextInt();
		}
		for (int a1:a)
		{
			System.out.println("values: " +a1);
		}

	}

}
