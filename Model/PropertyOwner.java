package Model;

import java.util.ArrayList;
import java.util.List;

public class PropertyOwner extends Person {

    private String bankAccount;
    private List<Property> ownedProperties;   

    public PropertyOwner(IdentificationType idType, String idNumber, String firstName, String lastName,
                         String mailingAddress, String phoneNumber, PhoneType phoneType, String email,
                         String bankAccount) {
        super(idType, idNumber, firstName, lastName, mailingAddress, phoneNumber, phoneType, email);
        this.bankAccount = bankAccount;
        this.ownedProperties = new ArrayList<>();
    }
}
