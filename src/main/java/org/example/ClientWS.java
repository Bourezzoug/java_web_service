package org.example;

import jakarta.xml.ws.Service;
import javax.xml.namespace.QName;
import java.net.URL;
import java.util.List;

public class ClientWS {
    public static void main(String[] args) throws Exception {
        URL wsdlURL = new URL("http://localhost:8080/BanqueService?wsdl");
        QName qname = new QName("http://example.org/", "BanqueServiceImplService");

        Service service = Service.create(wsdlURL, qname);
        BanqueService banqueService = service.getPort(BanqueService.class);

        // Test the service
        System.out.println("Converting 100 EUR to DH:");
        double result = banqueService.conversion(100.0);
        System.out.println("100 EUR = " + result + " DH");
    }
}