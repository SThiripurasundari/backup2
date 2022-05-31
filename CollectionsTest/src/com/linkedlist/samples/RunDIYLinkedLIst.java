package com.linkedlist.samples;

import java.util.LinkedList;
import java.util.Stack;

public class RunDIYLinkedLIst {

	public static void main(String[] args) {
		

		DIYLinkedList list = new DIYLinkedList();
		list = list.insertData(list, "A");
		list = list.insertData(list, "B");
		list = list.insertData(list, "C");
		//list = list.insertData(list, "D");
		//list = list.insertData(list, "E");
		//list = list.insertData(list, "F");
		//print(list);
		System.out.println("size :"+list.getSize(list));
		//list = list.insertAtMiddle(list, "S");
		//list = list.insertAtMiddleUsing2Ptr(list, "S");
		 list.deleteDatabyposition(list,2);
		
		
		list = list.reverseData(list);
		print(list);

		/*DIYLinkedList intList = new DIYLinkedList();
		intList = intList.insertData(intList, 100);
		intList = intList.insertData(intList, 200);
		intList = intList.insertData(intList, 300);
		intList = intList.insertData(intList, 400);
		intList = intList.insertData(intList, 500);
		intList = intList.insertData(intList, 600);
		print(intList);*/

	}

	public static void print(DIYLinkedList list) {
		Node node = list.head;

		while (node != null) {
			System.out.println("Data : " + node.data  );
			//System.out.println("Data : " + node.intdata  );
			node = node.next;

		}

	}

}
