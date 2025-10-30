package com.example.demo;

public class MainApplication {
    public static void main(String[] args) {
        MessageService service = new MessageService();
        System.out.println(service.getMessage());
    }
}

