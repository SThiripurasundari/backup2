package Practise;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Collection1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList  list = new ArrayList<String>();
		//ArrayListal=new ArrayList<String>();  
		list.add("1");
		list.add("2");
		list.add("3");
		list.add(1,"1a");
		
		
		System.out.println("1-->"+list);
		
		
		ArrayList list2 = new ArrayList<String>();
		list2.add("2- 1");
		list2.add("2-2");
		list2.add("2-3");
		list.add(list2);
		list.addAll(list2);
		//list.re
		System.out.println("2-->"+list);
		ListIterator<ArrayList> itr=list.listIterator();  
		  //traversing elements of ArrayList object  
		for (int t=0;t<list.size();t++) {
		   
		   // System.out.println(list.get(t));  
		  }
		
		  //Iterator itr1=list.iterator();  
		  while(itr.hasNext()){  
		   System.out.println("iternator"+itr.next());  
		  }  
	}
//		
//		  for(String fruit:list)  
//			    System.out.println(fruit);  
//
//	}

}
