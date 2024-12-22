package org.example;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import java.util.List;

@WebService
public interface BanqueService {
    @WebMethod
    double conversion(double montantEuro);

    @WebMethod
    Compte getCompte(int code);

    @WebMethod
    List<Compte> getComptes();
}