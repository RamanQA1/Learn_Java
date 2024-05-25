package raman_java;

public class star {
	

	void marry() {  // overridden method
	System.out.println("Arange marriage");
	}
	
}

class sun {
	
	void marry() {  // overriding method
		System.out.println("Love marriage");
		}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new sun().marry();
		new star().marry();
	}

}
