package model;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;

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
    private Date ownerSince;
    private final CityZone zone;
    private List<RentalAgreement> agreements = new ArrayList<>();

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

    public setStatus(PropertyStatus status) {
        this.status = status;
    }

    public transferOwnership(PropertyOwner newOwner, Date transferDate) {
        this.owner = newOwner;
        this.ownerSince = transferDate;
    }

    public addAgreement(RentalAgreement agreement) {
        agreements.add(agreement);
    }

    public boolean isFreeBetween(Date startDate, Date endDate) {
        RentalAgreement currentAgreement;
        for (i = 0; i < agreements.size(); i++) {
            currentAgreement = agreements.get(i);
            if (currentAgreement.overlaps(startDate, endDate)) {
                return false;
            }
        }
        return true;
    }

    public boolean matches(PropertyType type, String buildingCode, String zoneCode, int minBedrooms, float minArea, float maxArea, float minRent, float maxRent) {
        if (this.type != type) {
            return false;
        }
        if (this.buildingCode != buidlingCode) {
            return false;
        }
        if (this.zone.getZoneCode() != zoneCode) {
            return false;
        }
        if (this.bedrooms < minBedrooms) {
            return false;
        }
        if (this.area < minArea || this.area > maxArea) {
            return false;
        }
        if (this.listedMonthlyRent < minRent || this.listedMonthlyRent > maxRent) {
            return false;
        }
        return true;
    }

}