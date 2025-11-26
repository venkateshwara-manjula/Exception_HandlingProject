package com.example.FactoryDesignPattern;

public class ShapeFactory {
	
	public Shape getShape(String ShapeType) {
		
		if (ShapeType==null) {
			return null;
		}else if(ShapeType.equalsIgnoreCase("circle")){
			return new Circle();
		}else if(ShapeType.equalsIgnoreCase("Rectangle")){
			return new Rectangle();
		}
		else if(ShapeType.equalsIgnoreCase("square")){
			return new Square();
		}
		return null;
	}

}
