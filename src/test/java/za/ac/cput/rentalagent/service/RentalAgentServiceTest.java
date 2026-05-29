package za.ac.cput.rentalagent.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import za.ac.cput.rentalagent.domain.Name;
import za.ac.cput.rentalagent.domain.RentalAgent;
import za.ac.cput.rentalagent.repository.RentalAgentRepository;

import static org.junit.jupiter.api.Assertions.assertNotNull;


@ExtendWith(MockitoExtension.class)
class RentalAgentServiceTest {

    @Mock
    private RentalAgentRepository rentalAgentRepository;

    @InjectMocks
    private RentalAgentService rentalAgentService;



    @Test
    void testRead(){
        Name name = new Name.Builder()
                .setFirstName("Jane")
                .setLastName("Smith")
                .build();

        RentalAgent agent = new RentalAgent.Builder()
                .setName(name)
                .setEmail("mock@gmail.com")
                .setMobileNumber("1234567890")
                .build();

        Mockito.when(rentalAgentRepository.findById("mock@gmail.com")).thenReturn(java.util.Optional.of(agent));

        RentalAgent result = rentalAgentService.read("mock@gmail.com");

        assertNotNull(result);
        System.out.println(result);

    }
}