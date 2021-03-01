package com.rakuten.training.basics;

public class Driver {
    
    public void testDrive(Vehicle v) {
        v.start();
        System.out.println("-------- Wroooom ---------");
        v.stop();
    }

}