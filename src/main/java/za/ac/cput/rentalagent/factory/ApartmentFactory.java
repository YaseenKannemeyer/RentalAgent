package za.ac.cput.rentalagent.factory;

import za.ac.cput.rentalagent.domain.Apartment;
import za.ac.cput.rentalagent.util.Helper;

public class ApartmentFactory {
    public static Apartment createApartment(Long propertyId, String streetNumber, String streetName, String suburb, String city, int postalCode, double rentalCost, String apartmentName, String apartmentNumber, int floorSize) {
        if (Helper.isNullOrEmpty(streetNumber) || Helper.isNullOrEmpty(streetName) || Helper.isNullOrEmpty(suburb) || Helper.isNullOrEmpty(city) || Helper.isNullOrEmpty(apartmentName) || Helper.isNullOrEmpty(apartmentNumber)) {
            return null;
        }

        return new Apartment.Builder()
                .setPropertyId(propertyId)
                .setStreetNumber(streetNumber)
                .setStreetName(streetName)
                .setSuburb(suburb)
                .setCity(city)
                .setPostalCode(postalCode)
                .setRentalCost(rentalCost)
                .setApartmentName(apartmentName)
                .setApartmentNumber(apartmentNumber)
                .setFloorSize(floorSize)
                .build();

    }
}
