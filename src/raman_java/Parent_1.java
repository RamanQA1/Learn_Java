package raman_java;

public class Parent_1 {
	
	void marry() {  // overridden method
		System.out.println("Arange marriage");
		}
		
	
  static class Childs extends Parent_1{
	
	void marry() {  // overriding method
		System.out.println("Love marriage");
		}



	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new Childs().marry();
	}
}
}


