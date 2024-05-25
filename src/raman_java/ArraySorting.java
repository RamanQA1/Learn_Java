package raman_java;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraySorting {

	public static void main(String[] args) {
		
		String a[]= {"raman","rohit","raj"};
//		int a[]= {10,30,50,5};
		System.out.println(Arrays.toString(a));// print the array values in string..
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.asList(a));
		
//		
//		String x="raman";
//		x=x.concat("Thakur");
//		System.out.println(x);

	}

}