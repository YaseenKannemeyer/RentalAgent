package za.ac.cput.rentalagent.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.rentalagent.domain.House;
import za.ac.cput.rentalagent.service.HouseService;

@RestController
@RequestMapping("/house")
public class HouseController {

    private HouseService houseService;

    @Autowired
    public HouseController(HouseService houseService) {
        this.houseService = houseService;
    }

    @PostMapping("/house/create")
    public House create(@RequestBody House house) {
        return houseService.create(house);
    }

    @GetMapping("/house/read/{propertyId}")
    public House read(@PathVariable Long propertyId) {
        return houseService.read(propertyId);
    }

    @PutMapping("/house/update")
    public House update(@RequestBody House house) {
        return houseService.update(house);

    }

    @DeleteMapping("/house/delete/{propertyId}")
    public boolean delete(@PathVariable Long propertyId) {
        return houseService.delete(propertyId);
    }

    @GetMapping("/house/getAll")
    public java.util.List<House> getAll() {
        return houseService.getAll();
    }


}
