package com.example.FactoryDesignPattern;

public class FactorPattern {

	public static void main(String[] args) {
		
		ShapeFactory sp=new ShapeFactory();
		
		Shape c=sp.getShape("circle");
		c.draw();
		
		Shape r=sp.getShape("rectangle");
		r.draw();
	}

}
