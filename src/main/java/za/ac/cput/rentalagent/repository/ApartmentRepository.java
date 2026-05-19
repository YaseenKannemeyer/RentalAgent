package za.ac.cput.rentalagent.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.rentalagent.domain.Apartment;

@Repository
public interface ApartmentRepository extends JpaRepository<Apartment, Long> {
}
