package raman_java;

import java.util.Vector;

public class Logics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Vector v=new Vector();
		
		System.out.println("Initial Capacity default: "+v.capacity());
		
		for (int i=1; i<=20;i++){
			v.addElement(i);
		}
		System.out.println("Elements list: "+v);
		
		v.addElement("a");
		v.add("b");
		v.add(22);
		System.out.println("New Capacity: "+v.capacity());
		System.out.println("Elements list: "+v);
		System.out.println("Hello");
		System.out.println();
	}

	

}
