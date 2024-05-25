package raman_java;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SET_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<String> s = new HashSet<String>();

		s.add("Ajay");
		s.add("Vijay");
		s.add("Sumit");
		System.out.println(s);

		s.remove("Vijay");

		System.out.println(s);

		Set<String> s1 = new LinkedHashSet<String>();

		s1.add("Ajay");
		s1.add("Vijay");
		s1.add("Sumit");
		System.out.println(s1);

		s1.remove("Sumit");

		System.out.println(s1);

		

	}

}
