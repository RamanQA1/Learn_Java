package raman_java;


import java.util.Comparator;
import java.util.TreeSet;

public class TREESET_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		// adding Heterogeneous data into TreeSet
		TreeSet<String> t= new TreeSet<String>(new comp());
		t.add("Ajay");
		t.add("Sameer");
		t.add("Vijay");
		t.add("Sumit");
		t.add("Bharat");
		
		System.out.println(t);  // [Ajay, Bharat, Sameer, Sumit, Vijay]
		
		TreeSet<Integer> t1= new TreeSet<Integer>(new compInt());
		t1.add(10);
		t1.add(30);
		t1.add(89);
		t1.add(78);
		t1.add(90);
		
		System.out.println(t1);
		
		TreeSet t2= new TreeSet(new compInt());
		t2.add(10);
		t2.add(40);
		t2.add(99);
		t2.add(78);
		t2.add(90);
		
		System.out.println(t2);
		
		
	}
}

class comp implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		
		return -o1.compareTo(o2);
	}
}

class compInt implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		return -o1.compareTo(o2);
	}
	

	}


