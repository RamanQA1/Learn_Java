package raman_java;

import java.util.Enumeration;
import java.util.Vector;

public class Cursor_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vector v= new Vector();
		v.addElement(10);
		v.addElement(20);
		v.addElement(30);

		Enumeration e=v.elements();
		
		
		while(e.hasMoreElements())
		{
			Integer i=(Integer) e.nextElement(); // it return Object data, so typecasting should be applied
			
				System.out.println(i);
			}
	
		

	}

}
