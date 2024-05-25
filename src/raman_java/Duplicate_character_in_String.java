package raman_java;

public class Duplicate_character_in_String {

	public static void main(String[] args) {

		String d = "ramanthakur";
		int length = d.length();
		char[] ch = d.toCharArray();

		for (int i = 0; i < length; i++) {

			for (int j = i + 1; j < length; j++) {

				if (ch[i] == ch[j]) {

					System.out.println(ch[j]);

				}

			}

		}

	}

}
