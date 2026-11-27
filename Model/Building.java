package model;

import java.util.List;
import java.util.ArrayList;

public class Building {
    private final String buildingCode;
    private final String name;
    private final String streetAddress;
    private final String city;
    private final CityZone zone;
    private final int numberOfFloors;
    private final int numberOfApartments;
    private final int yearOfConstruction;
    private List<Apartment> apartments = new ArrayList<>(); 

    public Building(String buildingCode, String name, String streetAddress, String city, CityZone zone, int numberOfFloors, int numberOfApartments, int yearOfConstruction) {
        this.buildingCode = buildingCode;
        this.name = name;
        this.streetAddress = streetAddress;
        this.city = city;
        this.zone = zone;
        this.numberOfFloors = numberOfFloors;
        this.numberOfApartments = numberOfApartments;
        this.yearOfConstruction = yearOfConstruction;
    }

    public String getBuildingCode() {
        return buildingCode;
    }

    public CityZone getCityZone() {
        return zone;
    }

    public List<Apartment> getApartments() {
        return apartments;
    }

    public boolean isUnitNumberUnique(String unitNumber) {
        Apartment currentApartment;
        for (i = 0; i < apartments.size(); i++) {
            currentApartment = apartments.get(i);
            if (unitNumber == currentApartment.getUnitNumber()) {
                return false;
            }
        }
        return true;
    }

    public addApartment(Apartment apartment) {
        apartments.add(apartment);
    }

    public boolean hasRoomForApartment() {
        if (numberOfApartments < apartments.size()) {
            return true;
        }
        return false;
    }

    public Apartment findApartment(String propertyCode) {
        Apartment currentApartment;
        for (i = 0; i < apartments.size(); i++) {
            currentApartment = apartments.get(i);
            if (propertyCode == currentApartment.getPropertyCode()) {
                return currentApartment;
            }
        }
    }

    public int countByStatus (PropertyStatus status) {
        Apartment currentApartment;
        int count = 0;
        for (i = 0; i < apartments.size(); i++) {
            currentApartment = apartments.get(i);
            if (status == currentApartment.getStatus()) {
                count++;
            }
        }
        return count;
    }

    public float[] getRentStatistics() {
        Apartment currentApartment;
        float[] rents = new float[3];
        int allRents = 0;
        int minRent = 0;
        int maxRent = 0;
        for (i = 0; i < apartments.size(); i++) {
            currentApartment = apartments.get(i);
            allRents += currentApartment.getListedMonthlyRent();
            if (current.Apartment.getListedMonthlyRent() < minRent) {
                minRent = currentApartment.getListedMonthlyRent();
            } else if (current.Apartment.getListedMonthlyRent() > maxRent) {
                maxRent = current.Apartment.getListedMonthlyRent();
            }
        }
        int averageRent = allRents / apartments.size();
        rents[0] = minRent;
        rents[1] = maxRent;
        rents[2] = averageRent;
        return rents;
    }
}