package za.ac.cput.rentalagent.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.rentalagent.domain.Apartment;
import za.ac.cput.rentalagent.service.ApartmentService;

@RestController
@RequestMapping("/apartment")
public class ApartmentController {

    private ApartmentService apartmentService;

    @Autowired
    public ApartmentController(ApartmentService apartmentService) {
        this.apartmentService = apartmentService;
    }

    @PostMapping("/apartment/create")
    public Apartment create(@RequestBody Apartment apartment) {
        return apartmentService.create(apartment);
    }

    @GetMapping("/apartment/read/{propertyId}")
    public Apartment read(@PathVariable Long propertyId) {
        return apartmentService.read(propertyId);
    }

    @PutMapping("/apartment/update")
    public Apartment update(@RequestBody Apartment apartment) {
        return apartmentService.update(apartment);

    }

    @DeleteMapping("/apartment/delete/{propertyId}")
    public boolean delete(@PathVariable Long propertyId) {
        return apartmentService.delete(propertyId);
    }

    @GetMapping("/apartment/getAll")
    public java.util.List<Apartment> getAll() {
        return apartmentService.getAll();
    }


}
