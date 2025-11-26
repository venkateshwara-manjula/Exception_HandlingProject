package com.example.Streams;

@FunctionalInterface
interface Hello{
	public int display(int a, int b);
}
public class LambdaFunctions {

	public static void main(String[] args) {
		
		Hello d=(a,b)->a+b;
		
		System.out.println(d.display(2,3));
		

	}

}
