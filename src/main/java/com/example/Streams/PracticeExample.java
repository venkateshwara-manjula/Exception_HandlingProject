package com.example.Streams;


import java.util.*;
public class PracticeExample {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(10, 20, 30, 40);

		double average = numbers.stream()
		                        .mapToInt(Integer::intValue)
		                        .average()
		                        .getAsDouble();
		
	


	}

}
