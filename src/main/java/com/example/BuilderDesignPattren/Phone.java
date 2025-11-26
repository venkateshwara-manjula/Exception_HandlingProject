package com.example.BuilderDesignPattren;

public class Phone {
	private String os;
	private int ram;
	private String Processor;
	private double  screenSize;
	private int battery;
	public Phone(String os, int ram, String processor, double screenSize, int battery) {
		super();
		this.os = os;
		this.ram = ram;
		Processor = processor;
		this.screenSize = screenSize;
		this.battery = battery;
	}
	
	
	@Override
	public String toString() {
		return "PhoneBuilder [os=" + os + ", ram=" + ram + ", Processor=" + Processor + ", screenSize=" + screenSize
				+ ", battery=" + battery + "]";
	}
}
