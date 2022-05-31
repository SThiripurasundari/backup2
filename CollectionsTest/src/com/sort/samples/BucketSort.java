package com.sort.samples;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class BucketSort {
	 public static void main(String args[])
	    {
	        float arr[] = { (float)0.897, (float)0.565,
	                        (float)0.656, (float)0.1234,
	                        (float)0.665, (float)0.3434 };
	 
		 //float arr[] = { (float)1.0 , (float)5.0,(float)2.0,(float)1.1,(float)6.0,(float)4.0};
		 
	        int n = arr.length;
	        bucketSort(arr, n);
	 
	        System.out.println("Sorted array is ");
	        for (float el : arr) {
	            System.out.print(el + " ");
	        }
	    }
	 

	    // Function to sort arr[] of size n
	    // using bucket sort
	    static void bucketSort(float arr[], int n)
	    {
	        if (n <= 0)
	            return;
	 
	        // 1) Create n empty buckets
	        @SuppressWarnings("unchecked")
	        List<Float>[] buckets = new List[n];
	 
	        for (int i = 0; i < n; i++) {
	            buckets[i] = new LinkedList<Float>();
	        }
	 
	        // 2) Put array elements in different buckets
	        for (int i = 0; i < n; i++) {
	            float idx = arr[i] * n;
	            System.out.println("arr[i]:"+arr[i] + "  n :"+n + "  int()idx "+(int)idx);
	            buckets[(int)idx].add(arr[i]); }
	        
	        System.out.println("buckets"+buckets.toString());
	        // 3) Sort individual buckets
	        for (int i = 0; i < n; i++) {
	            Collections.sort(buckets[i]);
	        }
	 
	        // 4) Concatenate all buckets into arr[]
	        int index = 0;
	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j < buckets[i].size(); j++) {
	                arr[index++] = buckets[i].get(j);
	            }
	        }
	    }
	

}
