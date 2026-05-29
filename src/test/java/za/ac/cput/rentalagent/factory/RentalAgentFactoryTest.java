package za.ac.cput.rentalagent.factory;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import za.ac.cput.rentalagent.domain.Name;
import za.ac.cput.rentalagent.domain.RentalAgent;
import za.ac.cput.rentalagent.repository.RentalAgentRepository;

import static org.junit.jupiter.api.Assertions.*;


class RentalAgentFactoryTest {

    @Test
    void createRentalAgent() {
        Name name = new Name.Builder()
                .setFirstName("Jane")
                .setLastName("Smith")
                .build();

        RentalAgent agent = RentalAgentFactory.createRentalAgent(name, "yaseenkannemeyr@gmail.com", "1234567890");
        System.out.println(agent);
    }
}