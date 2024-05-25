package raman_java;

import java.util.ArrayList;
import java.util.Arrays;

public class gaurav {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int[] arr2= {1,2,4,5,6,7,8,9,10,122};
//		{
//			for (int i =0; i<arr2.length;i++)
//			{
//				if(arr2[i]%2==0 )
//				{
//					System.out.println(arr2[i]);
//				}
//			}
//		}
		
		String[] s= {"ajay","vijay","anuj"};
		ArrayList<String> al=new ArrayList<String>(Arrays.asList(s));
		al.add("A");
		al.add("B");
		al.add("C");
		al.remove("anuj");
		System.out.println(al);

		ArrayList<Integer> a2=new ArrayList<Integer>();
	}

}
