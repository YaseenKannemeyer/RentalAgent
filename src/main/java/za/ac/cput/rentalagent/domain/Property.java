package za.ac.cput.rentalagent.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "properties")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Property {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    protected Long propertyId;
    protected String streetNumber;
    protected String  streetName;
    protected String suburb;
    protected String city;
    protected int postalCode;
    protected double rentalCost;

    @ManyToOne
    @JoinColumn(name = "rental_agent_email", referencedColumnName = "email")
    private RentalAgent rentalAgent;

    public abstract String toString();
}
