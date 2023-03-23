package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly obj = new RWOnly();
        // obj.name = "Rohith";
        //  System.out.print(obj.name);
        //name has private access in com.driver.RWOnly
        String name = obj.get();
        obj.set("Rohith");
        System.out.print(obj.get());
    }
  
}