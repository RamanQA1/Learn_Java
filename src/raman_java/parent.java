package raman_java;


	
	class Parent{
		Parent ( int b){
			System.out.println("Parent 1-arg Constructor");
		}
			
	}
	class Child extends Parent{

		Child(){
			
			this(10);
			
			System.out.println("Child 0-arg Constructor");
		}	
		Child(int a){
			
			super(50);
			System.out.println("Child 1-arg Constructor");
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new Child();
//		new Child(10);
		
		
	}
}





