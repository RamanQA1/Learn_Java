package raman_java;

import java.util.ArrayList;
import java.util.HashSet;

public class Collections_1 {

	public static void main(String[] args) {
		
		ArrayList E=new ArrayList();
		
		E.add("raman");
		E.add("raman");
		E.add("akash");
		E.add("rohan");
		E.add("akash");
		
		System.out.println(E);
		
		HashSet H=new HashSet(E);
		System.out.println(H);
		
		ArrayList E1=new ArrayList(H);		
		System.out.println(E1);
		

	}

}
