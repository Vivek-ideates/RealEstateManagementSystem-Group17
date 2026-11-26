package Model;

public class Apartment extends Property {

    private String unitNumber;
    private int floor;
    private Building building;  

    public Apartment(Building building, String propertyCode, String unitNumber, int floor,
                     float area, int bedrooms, int bathrooms,
                     float listedMonthlyRent, float salePrice, PropertyOwner owner) {
        super(propertyCode, area, bedrooms, bathrooms, listedMonthlyRent, salePrice, owner);
        this.building = building;
        this.unitNumber = unitNumber;
        this.floor = floor;
    }
    
}
