package raman_java;


import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.Map.Entry;
import java.util.PriorityQueue;

public class TREESET_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		PriorityQueue q=new PriorityQueue();
		
		q.offer("A");
		q.offer("B");
		q.offer("C");
		q.add("C");
		
			
		System.out.println("Elements of the Queue: "+q);
//		System.out.println('\n');
		
		Iterator itr= q.iterator();
		
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
		}
		
//		BY For Each Loop 
		for (Object o: q) {
			
			System.out.println(o);

			
		}
	}
		
	}


