package raman_java;

public class LengthOfString {

	public static void main(String[] args) {
		
//		String name="Ramanthakur";
//		
//		System.out.println("Lengh of String :" +name.length());
////////////////////////////////////////////////////////////////////////////////////		
		String name ="ramanthakur";
		int leng=name.length();
		String reverse="";
		
		for (int i = leng-1; i>=0; i--) {
			
			reverse= reverse+name.charAt(i);
			
		}
		System.out.println(reverse);
		
		                                                   



	}

}
