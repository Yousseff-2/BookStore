package com.Task.Service;

public class ShippingService {
    public static void send(String address, String ISBN){
        System.out.println("Shipping book with ISBN " + ISBN + " to " + address);
    }
}
