package raman_java;

public class B extends A{
	
	int a=1000;
	int b=2000;
	void display(int a, int b){ 
		
		System.out.println("Local variable : " + (a+b));
		System.out.println("Current Class variable : " + (this.a+this.b));
		System.out.println("Super Class variable : " + (super.a+super.b));
		
	}
	void sun() {
		System.out.println("Down sun");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		B b= new B ();
//		b.display(10, 20);
//		b.sun();
		
		A a=new A();
		a.sun();
		
		} 
}

