package za.ac.cput.rentalagent.factory;

import za.ac.cput.rentalagent.domain.House;
import za.ac.cput.rentalagent.util.Helper;

public class HouseFactory {
    public static House  createHouse(Long propertyId, String streetNumber, String streetName, String suburb, String city, int postalCode, double rentalCost, int erfSize){

        if(Helper.isNullOrEmpty(streetNumber) || Helper.isNullOrEmpty(streetName)|| Helper.isNullOrEmpty(suburb) || Helper.isNullOrEmpty(city))
            return null;

        if (!Helper.isValidPostalCode(postalCode)){
            return null;
        }

        return new House.Builder()
                .setPropertyId(propertyId)
                .setStreetNumber(streetNumber)
                .setStreetName(streetName)
                .setSuburb(suburb)
                .setCity(city)
                .setPostalCode(postalCode)
                .setRentalCost(rentalCost)
                .setErfSize(erfSize)
                .build();

    }
}
