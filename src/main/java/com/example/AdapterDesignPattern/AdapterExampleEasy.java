package com.example.AdapterDesignPattern;

public class AdapterExampleEasy {

	public static void main(String[] args) {
		// We have a USB Type-C Charger
        UsbTypeCCharger usbCharger = new UsbTypeCCharger();

        // But the laptop needs a RoundPinCharger
        // So we use an adapter
        RoundPinCharger adapter = new RoundPinToUsbAdapter(usbCharger);

        // Plug adapter into laptop
        Laptop laptop = new Laptop(adapter);
        laptop.chargeLaptop();

	}

}
