package raman_java;

public class constructor_1 {
	int x=12;
	int y=98;
	int a=666;
	int b=777;
//	String course;
	
	void m1()
	{

      System.out.println(x+y);
//      System.out.println("course: " +course) ;
		
	}
	
	constructor_1 ()
	{
		x=50;
		y=20;
			System.out.println ("x; " +x);
			System.out.println ("y; " +y);
			
	}
	
	constructor_1 (int a,int b)
	
	{
//		x=a;
//		y=b;
//		System.out.println ("x; " +x);
//		System.out.println ("y; " +y);
		
		System.out.println (this.a);
		System.out.println ("b: " +b);
	}
	{
//		course="core java";           // Instance Block.
		  System.out.println("course=java") ;
	}
	                                 
constructor_1 (int h,int k,int p)
	
	{
	a=h;
	b=k;
	y=p;

		
		System.out.println ("h: " +a);
		System.out.println ("k: " +b);
		System.out.println ("p: " +y);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		constructor_1 t=new constructor_1();
		
//		new constructor_1();
		new constructor_1(100,40);
		new constructor_1(500,600,800);
		
		t.m1();
		
		
		

	}

}
