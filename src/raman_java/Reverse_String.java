package raman_java;

public class Reverse_String {

	public static void main(String[] args) {
		
		String name="Raman";
		
		String reverse="";
		
		for(int i=name.length()-1;i>=0;i--) {
			reverse=reverse+name.charAt(i);
			
		}
		System.out.println(reverse);

	}

}
