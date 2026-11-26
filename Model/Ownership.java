package Model;

import java.time.LocalDate;

public class Ownership {

    private LocalDate startDate;
    private LocalDate endDate;
    private PropertyOwner owner;   // relationship: the line down to PropertyOwner (owner 1)

    public Ownership(PropertyOwner owner, LocalDate startDate, LocalDate endDate) {
        this.owner = owner;
        this.startDate = startDate;
        this.endDate = endDate;
    }
}