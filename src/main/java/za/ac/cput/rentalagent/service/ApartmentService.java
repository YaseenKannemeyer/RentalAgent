package za.ac.cput.rentalagent.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.rentalagent.domain.Apartment;
import za.ac.cput.rentalagent.repository.ApartmentRepository;

import java.util.List;

@Service
public class ApartmentService implements IService<Apartment, Long>{
    private ApartmentRepository apartmentRepository;

    @Autowired
    ApartmentService(ApartmentRepository apartmentRepository) {
        this.apartmentRepository = apartmentRepository;
    }

    @Override
    public Apartment create(Apartment apartment) {
        return this.apartmentRepository.save(apartment);
    }

    @Override
    public Apartment read(Long aLong) {
        return this.apartmentRepository.findById(aLong).orElse(null);
    }

    @Override
    public Apartment update(Apartment apartment) {
        return this.apartmentRepository.save(apartment);
    }

    @Override
    public boolean delete(Long aLong) {
        this.apartmentRepository.deleteById(aLong);
        return true;
    }

    @Override
    public List<Apartment> getAll() {
        return this.apartmentRepository.findAll();
    }
}
