package model;

public class Agreement {
    private final String agreementCode;
    private final Property property;

    public agreement(String agreementCode, Property property) {
        this.agreementCode = agreementCode;
        this.property = property;
    }

    public String getAgreementCode() {
        return agreementCode;
    }

    public Property getProperty() {
        return property;
    }
}