
package raman_java;

import java.util.Scanner;

public class java_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int paswd;
		System.out.println("Enter Password:= ");
		Scanner x=new Scanner(System.in);
		paswd=x.nextInt();
		if(paswd==3322)
		{
			
			System.out.println("My Name:= Raman Thakur");
			System.out.println("My Age:= 26");
			System.out.println("My City:= Delhi");
		}
		
		else
		{
			
			System.out.println("Sorry Wrong password");
		}
		
		
		
	}

}
