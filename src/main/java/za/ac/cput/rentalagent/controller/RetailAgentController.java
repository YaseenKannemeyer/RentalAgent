package za.ac.cput.rentalagent.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.rentalagent.domain.RentalAgent;
import za.ac.cput.rentalagent.service.RentalAgentService;

import java.util.List;

@RestController
@RequestMapping("/rentalagent")
public class RetailAgentController {
    private RentalAgentService rentalAgentService;

    @Autowired
    public RetailAgentController(RentalAgentService rentalAgentService){
        this.rentalAgentService = rentalAgentService;
    }

    @PostMapping("/rentalagent/create")
    public RentalAgent create(@RequestBody RentalAgent rentalAgent) {
        return rentalAgentService.create(rentalAgent);
    }

    @GetMapping("/rentalagent/read/{email}")
    public RentalAgent read(@RequestParam String email) {
        return rentalAgentService.read(email);
    }

    @PutMapping("/rentalagent/update")
    public RentalAgent update(@RequestBody RentalAgent rentalAgent) {
        return rentalAgentService.update(rentalAgent);
    }

    @DeleteMapping("/rentalagent/delete/{email}")
    public boolean delete(@PathVariable String email) {
        return rentalAgentService.delete(email);
    }

    @GetMapping("/rentalagent/getAll")
    public List<RentalAgent> getAll() {
        return  rentalAgentService.getAll();
    }
}
