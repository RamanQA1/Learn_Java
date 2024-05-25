package raman_java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class PracticeForCode {

	public static void main(String[] args) {

//		
		int k[] = { 2, 4, 5, 4, 2, 6, 7, 8, 9, 6 };
//		String []a= {"raman","rohit","mtdj","raman","akash","rohit"};

		Set<Integer> L = new HashSet<Integer>();
		
		for (Integer integer : k) {
			
			L.add(integer);
			
		}

		System.out.println(L);
	
			


	}
}
