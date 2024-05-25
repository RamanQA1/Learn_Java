package raman_java;

interface IntfTest
{
	void m1();
	void m2();
	void m3();
}

public class Abcd implements IntfTest {
	
	
		public void m1(){
		System.out.println("m1-method implementation");
		}
		public void m2(){
		System.out.println("m2-method implementation");
		}
		public void m3(){
		System.out.println("m3–method implementation");
		} 
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IntfTest t=new Abcd();
		t.m1();
		t.m2();
		t.m3();
	} 

}



