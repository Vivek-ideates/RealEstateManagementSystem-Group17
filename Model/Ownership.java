package Model;

import java.time.LocalDate;

public class Ownership {

    private LocalDate startDate;
    private LocalDate endDate;
    private PropertyOwner owner;   

    public Ownership(PropertyOwner owner, LocalDate startDate, LocalDate endDate) {
        this.owner = owner;
        this.startDate = startDate;
        this.endDate = endDate;
    }
}