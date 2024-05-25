package raman_java;

public class Print_first_letterOf_String {

	public static void main(String[] args) {

		String st = "I Love Automation";

		String[] vc = st.split(" ");
		for (int i = 0; i < vc.length; i++) {

			System.out.println(vc[i].charAt(0));

		}

	}

}
