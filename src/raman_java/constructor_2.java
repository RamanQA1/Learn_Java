package raman_java;

public class constructor_2 {
	
	int a;
	String name;
	float salary;
	
	constructor_2  (int a,String name,float salary) // local variable.
	{		// conversation of local value to instance value
		
	
			this.a=a;
			this.name=name;
			this.salary=salary;
			System.out.println ("a: " +a);
			System.out.println ("name: " +name);
			System.out.println ("salary: " +salary);
	}
	{
		System.out.println("Course:= Core Java"); 
	}
	
//	void dispaly()
	{
//		System.out.println (a);
//		System.out.println (name);
//		System.out.println (salary);
	}
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new constructor_2 (10,"sandeep",500);
//		t1.dispaly();
		new constructor_2 (20,"rajeev",100);
//		t2.dispaly();
		new constructor_2(30,"raman",700);

	}

}
