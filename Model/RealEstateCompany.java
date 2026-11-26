package Model;

import java.util.ArrayList;
import java.util.List;

public class RealEstateCompany {

    private String name;
    private String address;
    private String city;
    private String phoneNumber;
    // relationships: compositions, so the company creates the lists itself
    private List<CityZone> zones;
    private List<Building> buildings;
    private List<Property> properties;
    private List<Person> people;
    private List<Agreement> agreements;

    public RealEstateCompany(String name, String address, String city, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.city = city;
        this.phoneNumber = phoneNumber;
        this.zones = new ArrayList<>();
        this.buildings = new ArrayList<>();
        this.properties = new ArrayList<>();
        this.people = new ArrayList<>();
        this.agreements = new ArrayList<>();
    }
}