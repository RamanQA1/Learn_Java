package raman_java;

public class Substring_of_String {

	public static void main(String[] args) {

		String v = "abbcd";

		for (int i = 0; i < v.length(); i++) {

			for (int j =i+1; j <= v.length(); j++) {

				System.out.println(v.substring(i, j));

			}

		}

	}

}
