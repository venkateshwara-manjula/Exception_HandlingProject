package com.example.Streams;

import java.util.*;
import java.util.stream.Collectors;

public class Uniqueelements {

	public static void main(String[] args) {
		String s1="madambanana";
	    
	    Set<Character> set=new HashSet<>();
	    Set<Character> duplicate=new HashSet<>();
	    
	    // for(char c:s1.toCharArray()){
	    //     if(!set.add(c))
	    //         duplicate.add(c);
	    // }
	    // System.out.println(duplicate);
	    // System.out.println(set);
	    
	    for(char c:s1.toCharArray()){
	        set.add(c);
	    }
	    System.out.println(set);
	    
	    String res=s1.chars()
	                .mapToObj(c->(char)c)
	                .distinct()
	                .map(String::valueOf)
	                .collect(Collectors.joining());
	    System.out.println(res);
	    
	    Map<Character, Long> mp=s1.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(c->c, Collectors.counting()));
	    System.out.println(mp);

	    }
	}
