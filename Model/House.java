package Model;

public class House extends Property {

    private String streetAddress;
    private String city;
    private int totalGarages;
    private CityZone zone;

    public House(CityZone zone, String propertyCode, String streetAddress, String city,
                 float area, int bedrooms, int bathrooms, int totalGarages,
                 float listedMonthlyRent, float salePrice, PropertyOwner owner) {
        super(propertyCode, area, bedrooms, bathrooms, listedMonthlyRent, salePrice, owner);
        this.zone = zone;
        this.streetAddress = streetAddress;
        this.city = city;
        this.totalGarages = totalGarages;
    }
}

