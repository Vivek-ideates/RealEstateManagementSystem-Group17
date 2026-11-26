package model;

import java.util.date;

public class Property {
    private final String propertyCode;
    private final float area;
    private final int bedrooms;
    private final int bathrooms;
    private float listedMonthlyRent;
    private float salePrice;
    private PropertyStatus status;
    private PropertyOwner owner;
    private date ownerSince;
    private 

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

    }

    public CityZone getZone() {

    }

    public PropertyOwner getCurrentOwner() {
        return owner;
    }
}