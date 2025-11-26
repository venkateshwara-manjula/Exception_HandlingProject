package com.example.AdapterDesignPattern;

public class Laptop {
    private RoundPinCharger charger;

    public Laptop(RoundPinCharger charger) {
        this.charger = charger;
    }

    public void chargeLaptop() {
        charger.chargeWithRoundPin();
    }
}