package org.example;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import java.util.ArrayList;
import java.util.List;

@WebService(endpointInterface = "org.example.BanqueService")
public class BanqueServiceImpl implements BanqueService {
    @Override
    @WebMethod
    public double conversion(double montantEuro) {
        final double tauxConversion = 10.5;
        return montantEuro * tauxConversion;
    }

    @Override
    @WebMethod
    public Compte getCompte(int code) {
        return new Compte(code, 1500.0);
    }

    @Override
    @WebMethod
    public List<Compte> getComptes() {
        List<Compte> comptes = new ArrayList<>();
        comptes.add(new Compte(1, 1500.0));
        comptes.add(new Compte(2, 3200.0));
        comptes.add(new Compte(3, 500.0));
        return comptes;
    }
}