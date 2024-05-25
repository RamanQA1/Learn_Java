package raman_java;

public class Sum_of_Array {

	public static void main(String[] args) {
		
		int sum=0;
		
		for (int i = 1; i <=10; i++) {
			
			if(i%2==0) {
				System.out.println("Even no=" +i);
				sum=sum+i;
			}
			
		}

		System.out.println(sum);

	}

}
