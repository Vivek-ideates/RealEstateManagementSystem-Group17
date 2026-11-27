package model;

import java.util.List;

public class Building {
    private final String buildingCode;
    private final String name;
    private final String streetAddress;
    private final String city;
    private final CityZone zone;
    private final int numberOfFloors;
    private final int numberOfApartments;
    private final int yearOfConstruction;
    private final List<Apartment> apartments;

    public building(String buildingCode, String name, String streetAddress, String city, CityZone zone, int numberOfFloors, int numberOfApartments, int yearOfConstruction, List<Apartment> apartments) {
        this.buildingCode = buildingCode;
        this.name = name;
        this.streetAddress = streetAddress;
        this.city = city;
        this.zone = zone;
        this.numberOfFloors = numberOfFloors;
        this.numberOfApartments = numberOfApartments;
        this.yearOfConstruction = yearOfConstruction;
        this.apartments = apartments;
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
}