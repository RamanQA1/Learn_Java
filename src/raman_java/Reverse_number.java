package raman_java;

public class Reverse_number {

	public static void main(String[] args) {
		int a = 5432;
		int reverse=0;
		int remainder;
		
		while(a !=0) {                          //a not equal to 0.
			remainder=a%10;
			reverse=reverse*10+remainder;
			a=a/10;
			
		}
		
		System.out.println(reverse);

	}

}
