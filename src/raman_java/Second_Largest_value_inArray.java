package raman_java;

public class Second_Largest_value_inArray {

	public static void main(String[] args) {
	
		int a[]= {8,9,4,6,10,11,34,34,11,35,12};
		int temp;
		
		for(int i=0;i<a.length;i++) {
			
			for(int j=i+1;j<a.length;j++) {
				
				if(a[i]<a[j]) {
					
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
				
			}
			
			}
		
		for(int i=0;i<a.length;i++) {         //for print in decending order
			System.out.print(a[i] + " ");
		}
		System.out.println();
		System.out.println("second Largest Element: " +a[1] );

	
	}
}


