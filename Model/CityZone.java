package model;

public class CityZone {
    private final String zoneCode;
    private final String name;
    private float referencerRentPerSqm;
    private float commissionPercentage;

    public CityZone(String zoneCode, String name, float referenceRentPerSqm, float commissionPercentage) {
        this.zoneCode = zoneCode;
        this.name = name;
        this.referencerRentPerSqm = referenceRentPerSqm;
        this.commissionPercentage = commissionPercentage;
    }

    public String getZoneCode() {
        return zoneCode;
    }
}