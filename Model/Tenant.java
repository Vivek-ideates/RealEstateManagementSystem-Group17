package model;

import java.util.List;
import java.util.arrayList;

public class Tenant extends Person {
    private List<RentalAgreement> agreements = new ArrayList<>();

    public Tenant(IndentificationType idType, String idNumber, String firstName, String lastName, String mailingAddress, String phoneNumber, PhoneType phoneType, String email, List<RentalAgreement> agreements) {
        super(idType, idNumber, firstName, lastName, mailingAddress, phoneNumber, phoneType, email);

        this.agreements = agreements;
    }

    public List<RentalAgreement> getAgreements() {
        return agreements;
    }
    
    public addAgreement(RentalAgreement agreement) {
        agreements.add(agreement);
    }

}