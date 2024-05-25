package raman_java;

public class Test {
	
	
	static int x=20;  // static 
	static double y;
	static boolean b=true;
	static String s;
	int w; // instance
	
	static String m1() {
		
		
		String b="Raman Thakur" ;// pri. local  
		return b;
		
		
		
		// instance area
		
//		System.out.println(b);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test t=new Test();
//		t.m1();
		
	   System.out.println(" instance vari. w value   :"  +t.w);

		
		 System.out.println(t.x);  // by reference object
		 System.out.println(y);  // directly 
		 System.out.println(Test.b); // Class name
		 System.out.println(s); // directly 
		 System.out.println(Test.m1());
	
//	Test(){
//		
//	}
//	
//	
//	Test (int a)
//	{
//			System.out.println ("1 -arg constructor");
//	}
//	
//	public static void main(String[] args){
//		
//		Test t=new Test();
//		Test t1=new Test(10);

	}

}
