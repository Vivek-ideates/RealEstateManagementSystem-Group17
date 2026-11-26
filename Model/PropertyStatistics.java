package Model;

public class PropertyStatistics {

    private String scope;
    private int availableCount;
    private int rentedCount;
    private float occupancyRate;
    private float minRent;
    private float maxRent;
    private float averageRent;

    public PropertyStatistics(String scope, int availableCount, int rentedCount,
                              float minRent, float maxRent, float averageRent) {
        this.scope = scope;
        this.availableCount = availableCount;
        this.rentedCount = rentedCount;
        this.minRent = minRent;
        this.maxRent = maxRent;
        this.averageRent = averageRent;
        // occupancyRate is calculated here in step 2 (rented / total x 100, R7.2)
    }
}