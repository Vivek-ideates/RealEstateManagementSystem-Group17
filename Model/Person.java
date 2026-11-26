package Model;

public abstract class Person {

    private IdentificationType idType;
    private String idNumber;
    private String firstName;
    private String lastName;
    private String mailingAddress;
    private String phoneNumber;
    private PhoneType phoneType;
    private String email;

    public Person(IdentificationType idType, String idNumber, String firstName, String lastName,
                  String mailingAddress, String phoneNumber, PhoneType phoneType, String email) {
        this.idType = idType;
        this.idNumber = idNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.mailingAddress = mailingAddress;
        this.phoneNumber = phoneNumber;
        this.phoneType = phoneType;
        this.email = email;
    }
}