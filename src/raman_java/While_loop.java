package raman_java;

import java.util.Scanner;

public class While_loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num;
		System.out.println("Enter any number:= ");
		Scanner s=new Scanner(System.in);
		num=s.nextInt();
		while(num>=0)
		{
			if(num%2==0)
			{
				System.out.print("Even Number");
				break;
			}
			
			else
			{
				System.out.print("Odd Number");
				break;
			}
			
			   
		}
		   System.out.print("While loop ended");
	}

}
