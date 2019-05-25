package com.class34;

import java.util.LinkedHashMap;
import java.util.Map;

public class Car {
	
    public String model;
    public String make;

    public Car(String make, String model) {
        this.make = make;
        this.model = model;
    }
    
    public void printCarDetails() {
       // System.out.println(“Make is “+make+” and model is “+model);
    }
}