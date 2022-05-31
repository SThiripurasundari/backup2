package com.samples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsImpl {

	public static void main(String[] args) {

		List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");
		List<String> filtered = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());

		System.out.println("filtered :" + filtered);

		List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);

		// get list of unique squares
		List<Integer> squaresList = numbers.stream().map(i -> i * i).distinct().collect(Collectors.toList());
		
		List<String> strings2= Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");

		//get count of empty string
		long count = strings2.parallelStream().filter(string -> string.isEmpty()).count();
		System.out.println("count :" + count);
	}

}
