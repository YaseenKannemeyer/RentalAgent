package za.ac.cput.rentalagent.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.rentalagent.domain.Apartment;
import za.ac.cput.rentalagent.repository.ApartmentRepository;

import java.util.List;

@Service
public class ApartmentService {
    private ApartmentRepository apartmentRepository;

    @Autowired
    ApartmentService(ApartmentRepository apartmentRepository) {
        this.apartmentRepository = apartmentRepository;
    }

    public Apartment create(Apartment apartment) {
        return this.apartmentRepository.save(apartment);
    }

    public List<Apartment> getAll(){
        return this.apartmentRepository.findAll();
    }
}
