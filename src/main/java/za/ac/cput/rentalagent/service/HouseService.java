package za.ac.cput.rentalagent.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.rentalagent.domain.House;
import za.ac.cput.rentalagent.repository.HouseRepository;

import java.util.List;

@Service
public class HouseService implements IService<House, Long>{
    private HouseRepository houseRepository;

    @Autowired
    HouseService(HouseRepository houseRepository) {
        this.houseRepository = houseRepository;
    }

    @Override
    public House create(House house) {
        return this.houseRepository.save(house);
    }

    @Override
    public House read(Long Id) {
        return this.houseRepository.findById(Id).orElse(null);
    }

    @Override
    public House update(House house) {
        return this.houseRepository.save(house);
    }

    @Override
    public boolean delete(Long Id) {
        this.houseRepository.deleteById(Id);
        return true;
    }

    @Override
    public List<House> getAll() {
        return this.houseRepository.findAll();
    }
}
