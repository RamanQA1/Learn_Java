package raman_java;

import java.util.LinkedHashSet;

public class Remove_Duplicate_Char_inString {

	public static void main(String[] args) {

		String str = "coconut";

		LinkedHashSet<Character> set = new LinkedHashSet<Character>();

		for (int i = 0; i < str.length(); i++) {

			set.add(str.charAt(i));

		}

		StringBuffer sb = new StringBuffer();

		for (Character c : set) {

			sb.append(c);

		}
		System.out.println(sb);
	}

}
