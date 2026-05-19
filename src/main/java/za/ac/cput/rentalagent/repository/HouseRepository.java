package za.ac.cput.rentalagent.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.rentalagent.domain.House;

@Repository
public interface HouseRepository extends JpaRepository<House, Long> {
}
