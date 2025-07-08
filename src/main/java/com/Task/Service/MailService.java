package com.Task.Service;

public class MailService  {
    public static void send(String email, String ISBN){
        System.out.println("Sending book with ISBN: " + ISBN + " to email: " + email);
    }
}
