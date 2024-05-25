package raman_java;

import java.util.Arrays;

public class Max_Array {

	public static void main(String[] args) {
		
		int a[]= {5,19,56,67};
		
		int max =a[0];
		
		
		for (int i = 1; i <a.length; i++) {
			if(a[i]>max) {
				max=a[i];
			}
			}
		System.out.println(max);
	

	}

}
