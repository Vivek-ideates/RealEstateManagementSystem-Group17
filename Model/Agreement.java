package Model;

public abstract class Agreement {

    private String agreementCode;
    private Property property;   // relationship: each agreement is for one property (the "property 1" line)

    public Agreement(String agreementCode, Property property) {
        this.agreementCode = agreementCode;
        this.property = property;
    }
}