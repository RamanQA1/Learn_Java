package raman_java;

public class Palindrome_no {

	public static void main(String[] args) {
		
		int no=124;
		int temp=no;
		int rev=0,rem;
		
		while(temp!=0) {
			rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
		}
		if(no==rev) {
			System.out.println("Palindrome Number :" +no);
			
		}
		else {
			System.out.println("Not a Palindrome: " +no);
		}
	}

}
