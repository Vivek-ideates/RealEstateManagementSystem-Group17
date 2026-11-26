package model;

import java.util.date;
import java.util.List;

public class Property {
    private final String propertyCode;
    private final float area;
    private final int bedrooms;
    private final int bathrooms;
    private float listedMonthlyRent;
    private float salePrice;
    private PropertyStatus status;
    private PropertyOwner owner;
    private final PropertyType type;
    private date ownerSince;
    private final CityZone zone;
    private List<RentalAgreement> agreements;

    public property(String propertyCode, float area, int bedrooms, int bathrooms, float listedMonthlyRent, float salePrice, PropertyStatus status, PropertyOwner owner, PropertyType type, date ownerSince, CityZone zone, List<RentalAgreement> agreements) {
        this.propertyCode = propertyCode;
        this.area = area;
        this.bedrooms = bedrooms;
        this.bathrooms = bathrooms;
        this.listedMonthlyRent = listedMonthlyRent;
        this.salePrice = salePrice;
        this.status = status;
        this.owner = owner;
        this.type = type;
        this.ownerSince = ownerSince;
        this.zone = zone;
        this.agreements = agreements;
    }

    public String getPropertyCode() {
        return propertyCode;
    }

    public float getArea() {
        return area;
    }

    public float getListedMonthlyRent() {
        return listedMonthlyRent;
    }

    public PropertyStatus getStatus() {
        return status;
    }

    public PropertyType getType() {
        return type;
    }

    public CityZone getZone() {
        return zone;
    }

    public PropertyOwner getCurrentOwner() {
        return owner;
    }

    public List<RentalAgreement> getAgreements() {
        return agreements;
    }
}