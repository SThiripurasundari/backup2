package com.linkedlist.samples;

public class DIYLinkedList {

	public Node head;

	public static DIYLinkedList insertData(DIYLinkedList list, String data) {
		Node node = new Node(data);
		node.next = null;

		// checks if the head is already present , else set the new node created as head
		if (list.head == null) {
			list.head = node;

		} else {
			Node tempNodeForItr = list.head;
			// when tempNodeForItr is null , then that is the last node that has to be
			// assigned with newly created object

			while (tempNodeForItr.next != null) {
				tempNodeForItr = tempNodeForItr.next;
			}

			// assign newly created node here i the last node which we got from abaove
			// iteration
			tempNodeForItr.next = node;

		}

		return list;
	}

	public static DIYLinkedList reverseData(DIYLinkedList list) {

		Node node = list.head;
		Node prev = null;
		Node current = node;
		Node next = null;

		while (current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		node = prev;
		list.head = node;

		return list;

	}

	public static DIYLinkedList insertData(DIYLinkedList list, int data) {
		Node node = new Node(data);

		System.out.println("node :" + node);
		// checks if the head is already present , else set the new node created as head
		if (list.head == null) {
			list.head = node;

		} else {
			Node tempNodeForItr = list.head;
			// when tempNodeForItr is null , then that is the last node that has to be
			// assigned with newly created object

			while (tempNodeForItr.next != null) {
				tempNodeForItr = tempNodeForItr.next;
			}

			// assign newly created node here i the last node which we got from abaove
			// iteration
			tempNodeForItr.next = node;

		}

		return list;
	}

	public static DIYLinkedList deleteData(DIYLinkedList list, String delThisdata) {
		Node currentNode = list.head;
		Node previousNode = null;

		// data is available at head itself , then make next data as head of list
		if (currentNode != null && currentNode.data.equals(delThisdata)) {
			list.head = currentNode.next;
			System.out.println(" found and deleted" + delThisdata);
			return list;
		}

		// if data is not in head , keep iterating the list and keep changing the
		// currentnode and previous node
		// until data matches the input , then come out of the loop
		while (currentNode != null && (!currentNode.data.equals(delThisdata))) {
			previousNode = currentNode;
			currentNode = currentNode.next;

		}

		if (currentNode != null) {
			previousNode.next = currentNode.next;

		}

		if (currentNode == null) { // Display the message
			System.out.println(delThisdata + " not found");
		}

		return list;
	}

	public static DIYLinkedList deleteDatabyposition(DIYLinkedList list, int delAT) {
		Node currNode = list.head, prev = null;

		if (delAT == 0 && currNode != null) {
			list.head = currNode.next;
			System.out.println(delAT + " position element deleted");

			// Return the updated List
			return list;
		}

		int counter = 0;
		while (currNode != null) {

			if (counter == delAT) {
				prev.next = currNode.next;
				
				
				System.out.println(delAT + " position element deleted");
				break;
			} else {
				prev = currNode;
				currNode = currNode.next;
				counter++;
			}

			if (currNode == null) {
				// Display the message
				System.out.println(delAT + " position element not found");
			}

		}

		return list;

	}

	public static int getSize(DIYLinkedList list) {
		int linkedListSize = 0;

		if (list.head == null) {

			linkedListSize = 0;
		} else {

			Node tempNodeForItr = list.head;
			linkedListSize = 1;
			while (tempNodeForItr.next != null) {
				tempNodeForItr = tempNodeForItr.next;
				linkedListSize++;
			}

			// assign newly created node here i the last node which we got from abaove
			// iteration

		}
		return linkedListSize;

	}

	public static DIYLinkedList insertAtMiddleUsing2Ptr(DIYLinkedList list, String insertThis) {

		Node slow = list.head;
		Node newnode = new Node(insertThis);
		Node fasthead = slow.next;

		while (fasthead != null && fasthead.next != null) {
			slow = slow.next;
			fasthead = fasthead.next.next;

		}
		newnode.next = slow.next;

		slow.next = newnode;

		return list;
	}

	public static DIYLinkedList insertAtMiddle(DIYLinkedList list, String insertThis) {
		System.out.println("Insert at :" + getSize(list));
		int temp = getSize(list);

		// int inserAt = temp / 2;
		int inserAt = ((temp % 2) == 0) ? (temp / 2) : (temp + 1) / 2;
		System.out.println("Insert at :" + inserAt);
		Node inserThis = new Node(insertThis);

		if (inserAt > 1) {

			Node tempNodeForItr = list.head;
			Node prev = null;
			int counter = 0;
			
			while (tempNodeForItr.next != null) {

				prev = tempNodeForItr;
				tempNodeForItr = tempNodeForItr.next;
				counter++;

				if (counter == inserAt) {
					prev.next = inserThis;
					inserThis.next = tempNodeForItr;
				}

			}

		}

		return list;
	}

}
