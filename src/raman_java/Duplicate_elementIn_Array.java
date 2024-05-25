package raman_java;

public class Duplicate_elementIn_Array {

	public static void main(String[] args) {
	
//		int a[]= {11,23,45,11,56,78,45,56};
		String a[]= {"java","c++","python","java"};
		
		for(int i=0;i<a.length;i++) {
			for (int j =i+ 1; j < a.length; j++) {
				if(a[i]==a[j]) {
					System.out.println("Duplicate number: " +a[j]);
				}
				
			}
		}

	}

}
