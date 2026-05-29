package za.ac.cput.rentalagent.controller;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import za.ac.cput.rentalagent.domain.Name;
import za.ac.cput.rentalagent.domain.RentalAgent;
import za.ac.cput.rentalagent.service.RentalAgentService;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class RetailAgentControllerTest {

    @Mock
    private RentalAgentService rentalAgentService;

    @InjectMocks
    private RetailAgentController retailAgentController;

    private RentalAgent createRentalAgent() {
        Name name = new Name.Builder()
                .setFirstName("Jane")
                .setMiddleName("Middel")
                .setLastName("Smith")
                .build();

        return new RentalAgent.Builder()
                .setName(name)
                .setEmail("mock@gmail.com")
                .setMobileNumber("1234567890")
                .build();
    }

    @Test
    void testCreate() {
        RentalAgent agent = createRentalAgent();
        when(rentalAgentService.create(agent)).thenReturn(agent);

        RentalAgent result = retailAgentController.create(agent);
        assertNotNull("mock@gmail.com", result.getEmail());
        assertEquals("Jane", result.getName().getFirstName());
        verify(rentalAgentService).create(agent);
        System.out.println(result);
    }

    @Test
    void testRead(){
        RentalAgent agent = createRentalAgent();
        when(rentalAgentService.read("mock@gmail.com")).thenReturn(agent);

        RentalAgent result = retailAgentController.read("mock@gmail.com");
        assertNotNull(result);
        assertNotNull("mock@gmail.com", result.getEmail());
        verify(rentalAgentService).read(result.getEmail());
        System.out.println(result);

    }

}