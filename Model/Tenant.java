package model;

import java.util.List;

public class Tenant extends Person {
    private List<RentalAgreement> agreements;

    public tenant(IndentificationType idType, String idNumber, String firstName, String lastName, String mailingAddress, String phoneNumber, PhoneType phoneType, String email, List<RentalAgreement> agreements) {
        super(idType, idNumber, firstName, lastName, mailingAddress, phoneNumber, phoneType, email);

        this.agreements = agreements;
    }

    public List<RentalAgreement> getAgreements() {
        return agreements;
    }

}