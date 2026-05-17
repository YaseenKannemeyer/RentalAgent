package za.ac.cput.rentalagent.factory;

import za.ac.cput.rentalagent.domain.Name;
import za.ac.cput.rentalagent.domain.RentalAgent;
import za.ac.cput.rentalagent.util.Helper;

public class RentalAgentFactory {
    public static RentalAgent createRentalAgent(Name name, String email, String mobileNumber){
        if ( Helper.isNullOrEmpty(email) || Helper.isNullOrEmpty(mobileNumber))
            return null;

        return new RentalAgent.Builder()
                .setName(name)
                .setEmail(email)
                .setMobileNumber(mobileNumber)
                .build();
    }
}
