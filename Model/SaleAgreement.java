package Model;

import java.time.LocalDate;

public class SaleAgreement extends Agreement {

    private LocalDate saleDate;
    private float agreedSalePrice;
    private float commissionPercentage;
    private String deedTransferNumber;
    private PropertyOwner seller;   
    private PropertyOwner buyer;   

    // agreementCode is added as the first parameter because the Agreement constructor needs it
    public SaleAgreement(String agreementCode, Property property, PropertyOwner seller, PropertyOwner buyer,
                         LocalDate saleDate, float agreedSalePrice, float commissionPercentage,
                         String deedTransferNumber) {
        super(agreementCode, property);
        this.seller = seller;
        this.buyer = buyer;
        this.saleDate = saleDate;
        this.agreedSalePrice = agreedSalePrice;
        this.commissionPercentage = commissionPercentage;
        this.deedTransferNumber = deedTransferNumber;
    }
}
