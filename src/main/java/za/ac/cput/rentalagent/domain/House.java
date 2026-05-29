package za.ac.cput.rentalagent.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "houses")
public class House extends Property{
    private int erfSize;

    public House() {
    }

    private House(Builder builder){
        this.propertyId = builder.propertyId;
        this.streetNumber = builder.streetNumber;
        this.streetName = builder.streetName;
        this.suburb = builder.suburb;
        this.city = builder.city;
        this.postalCode = builder.postalCode;
        this.rentalCost = builder.rentalCost;
        this.erfSize = builder.erfSize;

    }

    public int getErfSize() {
        return erfSize;
    }

    @Override
    public String toString() {
        return "House{" +
                "erfSize=" + erfSize +
                ", propertyId=" + propertyId +
                ", streetNumber='" + streetNumber + '\'' +
                ", streetName='" + streetName + '\'' +
                ", suburb='" + suburb + '\'' +
                ", city='" + city + '\'' +
                ", postalCode=" + postalCode +
                ", rentalCost=" + rentalCost +
                '}';
    }

    public static class Builder{
        private Long propertyId;
        private String streetNumber;
        private String  streetName;
        private String suburb;
        private String city;
        private int postalCode;
        private double rentalCost;
        private int erfSize;

        public Builder setPropertyId(Long propertyId) {
            this.propertyId = propertyId;
            return this;
        }

        public Builder setStreetNumber(String streetNumber) {
            this.streetNumber = streetNumber;
            return this;
        }

        public Builder setStreetName(String streetName) {
            this.streetName = streetName;
            return this;
        }

        public Builder setSuburb(String suburb) {
            this.suburb = suburb;
            return this;
        }

        public Builder setCity(String city) {
            this.city = city;
            return this;
        }

        public Builder setPostalCode(int postalCode) {
            this.postalCode = postalCode;
            return this;
        }

        public Builder setRentalCost(double rentalCost) {
            this.rentalCost = rentalCost;
            return this;
        }

        public Builder setErfSize(int erfSize) {
            this.erfSize = erfSize;
            return this;
        }

        public Builder copy(House house){
            this.propertyId = house.propertyId;
            this.streetNumber = house.streetNumber;
            this.streetName = house.streetName;
            this.suburb = house.suburb;
            this.city = house.city;
            this.postalCode = house.postalCode;
            this.rentalCost = house.rentalCost;
            this.erfSize = house.erfSize;
            return this;
        }

        public House build(){
            return new House(this);
        }
    }
}
