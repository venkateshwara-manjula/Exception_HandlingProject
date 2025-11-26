package com.example.AdapterDesignPattern;

//Adapter class - converts UsbTypeCCharger to RoundPinCharger
class RoundPinToUsbAdapter implements RoundPinCharger {
 private UsbTypeCCharger usbCharger;

 public RoundPinToUsbAdapter(UsbTypeCCharger usbCharger) {
     this.usbCharger = usbCharger;
 }

 @Override
 public void chargeWithRoundPin() {
     System.out.println("Using adapter to convert Round Pin to USB Type-C...");
     usbCharger.chargeWithUsbC();  // Delegating call
 }
}
