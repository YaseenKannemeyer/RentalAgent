package za.ac.cput.rentalagent.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.rentalagent.domain.Name;
import za.ac.cput.rentalagent.domain.RentalAgent;

import java.util.List;

@Repository
public interface RentalAgentRepository extends JpaRepository<RentalAgent, String> {
    RentalAgent findByEmail(String email);
    List<RentalAgent> findByName(Name name);
}
