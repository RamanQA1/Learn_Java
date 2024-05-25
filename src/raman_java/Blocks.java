package raman_java;

public class Blocks {
	
	String name;
	int fee;
	String course;
	
	Blocks(String name, int fee)
	{
		this.name=name;
		this.fee=fee;
	}
	
	{
		course="java";		
		System.out.println(course );
	}
	
	void m1() {
		
		System.out.println ("name = " +name);
		System.out.println ("Fee :" +fee);
//		System.out.println ("cour :" +course );
		
	}
	
	
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//named approch
				Blocks t=new Blocks("ajay",10000);
				t.m1();	
				
				Blocks t1=new Blocks("raman",20000);
				t1.m1();
				Blocks t2=new Blocks("shivam",60000);
				t2.m1();
		

	}

}
