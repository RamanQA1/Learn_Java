package raman_java;

public class Prime_no {

	public static void main(String[] args) {
//		
//		int no=7;
//		int temp=0;
//		
//		for (int i = 2; i<=no-1; i++) {
//			
//			if(no%i==0) {
//				
//				temp=temp=+1;// NOT WORK
//				
//			}
//			
//			if(temp==0) {
//				
//				System.out.println("Prime no:" +no);
//			}
//			else {
//				
//				System.out.println("Not prime no:" +no);
//				
//			}
//			
//		}

//		int num=7;
//		int count=0;
//		 for (int i = 1; i <=num; i++) {
//			 if(num%i==0) {
//				 count++;
//				 
//			 }
//			}
//		 if(count==2) {
//			 System.out.println("Prime no:" +num);
//			 
//		 }
//		 else {
//			 System.out.println("Not Prime no:" +num);
//		 }
		
		
		int sum=0;
		
		for (int i = 1; i <=50 ; i++) {
			int count1=0;
			for (int j = 1; j <=i; j++) {
				
				
				if(i%j==0) {
					count1++;
				}
				}
			if(count1==2) {
				System.out.println(i);
				sum=sum+i;
			}
			
			
			
		}
		System.out.println(sum);
	}

}
