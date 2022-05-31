package com.sample.Queue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class RunQSamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Two class implements - LinkedList and Priority Q
		// FIFO
		// LinkedList and PriorityQueue are the classes that implement the Queue
		// interface. ArrayBlockingQueue is yet another class that implements the Queue
		// interface.
		// The Queues that are a part of the java.util package can be classified as
		// unbounded queues while those present in java.util.the concurrent package is
		// bounded queues.
		// The Deque is a queue that supports insertion and deletion from both the ends.
		// The deque is thread-safe.
		// BlockingQueues are thread-safe and are used to implement producer-consumer
		// problems.
		// BlockingQueues do not allow null elements. A NullPointerException is thrown
		// if any operation related to null values is attempted.

		List<String> list = new ArrayList<>();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		String x = list.remove(0);
		System.out.println("The ArrayList contents:" + list + ":" + x);

		// 1. Linked List

		Queue<String> str_queue = new LinkedList<>();
		// initialize the queue with values
		str_queue.offer("one");
		str_queue.offer("two");
		str_queue.offer("three");
		str_queue.offer("four");
		String current = str_queue.peek();
		System.out.println("The Queue LinkedList contents:" + str_queue);
		String removedNumber = str_queue.poll();
		System.out.println("Removed Element: " + removedNumber);
		// print the Queue
		System.out.println("The Queue LinkedList contents:" + str_queue + ":" + current);

		// 2. Priority Queue

		PriorityQueue<String> str_pqueue = new PriorityQueue<>();
		// initialize the queue with values
		str_pqueue.offer("HIJ");
		str_pqueue.offer("EFG");
		str_pqueue.offer("KLM");
		str_pqueue.offer("ABC");

		System.out.println("The Queue contents:" + str_pqueue);
		// String current2 = str_pqueue.remove();
		String current3 = str_pqueue.peek();
		String removedNumber2 = str_pqueue.poll();

		System.out.println("Removed Element: " + removedNumber2);
		str_pqueue.offer("YUT");
		// print the Queue
		System.out.println("The Queue contents:" + str_pqueue + ":" + current3);

		for (Object object : str_pqueue) {
			String element = (String) object;
			System.out.print(element + " ");
		}

	}

}
