package raman_java;

public class constructor {
	
	
	void m1()
	{
		System.out.println ("m1 method called");
	}
	
    constructor ()
	{
			System.out.println ("0 -arg constructor");
	}
	
	constructor (int a)
	{
			System.out.println ("1 -arg constructor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		constructor t=new constructor();
		constructor t1=new constructor(10);
		t.m1();
		t1.m1();
		

	}

}
