package za.ac.cput.rentalagent.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.rentalagent.domain.House;
import za.ac.cput.rentalagent.repository.HouseRepository;

import java.util.List;

@Service
public class HouseService {

    private HouseRepository houseRepository;

    @Autowired
    HouseService(HouseRepository houseRepository) {
        this.houseRepository = houseRepository;
    }

    public House create(House house){
        return this.houseRepository.save(house);
    }

    public List<House> getAll(){
        return this.houseRepository.findAll();
    }
}
