package edu.jhl.services;

import edu.jhl.models.Car;
import edu.jhl.repositories.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {
    @Autowired
    private CarRepository carRepository;
    //mostrar todos los cars
    public List<Car> getAllCars(){
        return (List<Car>)carRepository.findAll();
    }
    //Crear car
    public Car createCar(Car car){
        return carRepository.save(car);
    }
    //editar car
    public Car updateCar(Car car){
        return carRepository.save(car);
    }
    //eliminar car
    public void deleteCar(long id){
        carRepository.deleteById(id);
    }
    //buscar car por id
    public Car findCarById(long id){
        return carRepository.findById(id).orElseGet(null);
    }
}
