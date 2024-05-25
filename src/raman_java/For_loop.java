package raman_java;

import java.util.Scanner;

public class For_loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int a=5;
//		int i;
//		for(i=1;i<=10;i++)
//		{
//			System.out.println(a*i);
//		}

		int num;
		int i;
		System.out.print("Enter Number:=");
		Scanner Q=new Scanner (System.in);
		num=Q.nextInt();
		for(i=1;i<=10; i++)
		{
			System.out.println(num*i);
		}
		
		
		
	}

}
