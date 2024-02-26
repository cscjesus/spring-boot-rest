package edu.jhl.controllers;

import edu.jhl.models.Car;
import edu.jhl.models.Owner;
import edu.jhl.services.CarService;
import edu.jhl.services.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api")
public class CarController {
    @Autowired
    CarService carService;
    @Autowired
    OwnerService ownerService;
    @GetMapping("cars")
    public List<Car> listar(){
        return carService.getAllCars();
    }
    @PostMapping("owners/{owner}/cars")
    public Car crear(@RequestBody Car car,@PathVariable long owner){
        car.setOwner(ownerService.findOwnerById(owner));
        return carService.createCar(car);
    }
    @PutMapping("owners/{owner}/cars/edit/{id}")
    public Car actualizar(@RequestBody Car car,@PathVariable("id") long id,@PathVariable("owner") long owner){
        car.setId(id);
        car.setOwner(ownerService.findOwnerById(owner));
        return carService.updateCar(car);
    }
    @DeleteMapping("cars/delete/{id}")
    public void eliminar(@PathVariable long id){
        carService.deleteCar(id);
    }
}
