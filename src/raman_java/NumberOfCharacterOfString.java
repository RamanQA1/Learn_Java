package raman_java;

public class NumberOfCharacterOfString {

	public static void main(String[] args) {
		
		String name="Hello World";
		
		int total_count=name.length();
		int total_count_removing_L=name.replace("l", "").length();
		int count=total_count-total_count_removing_L;
		
		System.out.println("Number Occurence of l is :" +count) ;
	
		

	}

}
