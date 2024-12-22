package org.example;

import jakarta.xml.ws.Endpoint;

public class ServicePublisher {
    public static void main(String[] args) {
        String url = "http://localhost:8080/BanqueService";
        Endpoint.publish(url, new BanqueServiceImpl());
        System.out.println("Service deployed at: " + url + "?wsdl");
    }
}