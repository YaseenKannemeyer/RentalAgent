package za.ac.cput.rentalagent.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.rentalagent.domain.RentalAgent;
import za.ac.cput.rentalagent.repository.RentalAgentRepository;

import java.util.List;

@Service
public class RentalAgentService implements IService<RentalAgent, String>{
    private RentalAgentRepository rentalAgentRepository;

    @Autowired
    RentalAgentService(RentalAgentRepository rentalAgentRepository) {
        this.rentalAgentRepository = rentalAgentRepository;
    }


    @Override
    public RentalAgent create(RentalAgent rentalAgent) {
        return this.rentalAgentRepository.save(rentalAgent);
    }

    @Override
    public RentalAgent read(String Id) {
        return this.rentalAgentRepository.findById(Id).orElse(null);
    }

    @Override
    public RentalAgent update(RentalAgent rentalAgent) {
        return this.rentalAgentRepository.save(rentalAgent);
    }

    @Override
    public boolean delete(String Id) {
        this.rentalAgentRepository.deleteById(Id);
        return true;
    }

    @Override
    public List<RentalAgent> getAll() {
        return this.rentalAgentRepository.findAll();
    }


}
