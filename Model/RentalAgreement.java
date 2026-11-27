package model;

import java.util.Date;

public class RentalAgreement extends Agreement {
    private final Tenant tenant;
    private final Date startDate;
    private final Date endDate;
    private final float agreedMonthlyRent;
    private final Date terminationDate;

    public rentalAgreement(String agreementCode, Property property, Tenant tenant, Date startDate, Date endDate, float agreedMonthlyRent, Date terminationDate) {
        super(agreementCode, property);

        this.tenant = tenant;
        this.startDate = startDate;
        this.endDate = endDate;
        this.agreedMonthlyRent = agreedMonthlyRent;
        this.terminationDate = terminationDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public float agreedMonthlyRent() {
        return agreedMonthlyRent;
    }

    public Tenant getTenant() {
        return tenant;
    }

    public terminate(Date terminationDate) {
        this.terminationDate = terminationDate;
    }

    public boolean isActiveOn(Date date) {
        return date.after(this.startDate) && date.before(this.endDate);
    }

    public boolean overlaps(Date startDate, Date endDate) {
        if (startDate.before(this.startDate) && endDate.before(this.startDate)) {
            return false;
        } else if (startDate.after(this.endDate) && endDate(this.endDate)) {
            return false;
        } else {
            return true;
        }
    }

}