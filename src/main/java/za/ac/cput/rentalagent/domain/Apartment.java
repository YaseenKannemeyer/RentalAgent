package za.ac.cput.rentalagent.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="apartments")
public class Apartment extends Property{
    private String apartmentName;
    private String apartmentNumber;
    private int floorSize;

    public Apartment() {
    }

    private Apartment(Builder builder){}

    public String getApartmentName() {
        return apartmentName;
    }

    public String getApartmentNumber() {
        return apartmentNumber;
    }

    public int getFloorSize() {
        return floorSize;
    }

    @Override
    public String toString() {
        return "Apartment{" +
                "apartmentName='" + apartmentName + '\'' +
                ", apartmentNumber='" + apartmentNumber + '\'' +
                ", floorSize=" + floorSize +
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
        private String apartmentName;
        private String apartmentNumber;
        private int floorSize;

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

        public Builder setApartmentName(String apartmentName) {
            this.apartmentName = apartmentName;
            return this;
        }

        public Builder setApartmentNumber(String apartmentNumber) {
            this.apartmentNumber = apartmentNumber;
            return this;
        }

        public Builder setFloorSize(int floorSize) {
            this.floorSize = floorSize;
            return this;
        }


        public Builder copy(Apartment apartment){
            this.propertyId = apartment.propertyId;
            this.streetNumber = apartment.streetNumber;
            this.streetName = apartment.streetName;
            this.suburb = apartment.suburb;
            this.city = apartment.city;
            this.postalCode = apartment.postalCode;
            this.rentalCost = apartment.rentalCost;
            this.apartmentName = apartment.apartmentName;
            this.apartmentNumber = apartment.apartmentNumber;
            this.floorSize = apartment.floorSize;
            return this;
        }

        public Apartment build(){
            return new Apartment(this);
        }

    }

}
