package edu.jhl.controllers;

import edu.jhl.repositories.CarRepository;
import edu.jhl.models.Home;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class HomeController {
    private static Logger logger;
    @Autowired
    CarRepository repository;

    @GetMapping()
    public Home hello() {
        /*logger = LoggerFactory.getLogger(HomeController.class);
        ;
        repository.save(new Car("Ford", "Mustang", "Red",
                "ADF-1121", 2021, 59000));
        repository.save(new Car("Nissan", "Leaf","White",
                "SSJ-3002", 2019, 29000));
        repository.save(new Car("Toyota", "Prius","Silver",
                "KKO-0212", 2020, 39000));
// Fetch all cars and log to console
        for (Car car : repository.findAll()) {
            logger.info(car.getBrand() + " " + car
                    .getModel());
        }*/
        Home home = new Home("Hello World!!");
        return home;
    }
}
