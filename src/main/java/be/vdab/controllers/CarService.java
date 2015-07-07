package be.vdab.controllers;

import be.vdab.domain.Car;
import be.vdab.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by jeansmits on 07/07/15.
 */

@RestController
@RequestMapping("cars")
public class CarService {

    @Autowired
    private CarRepository carRepository;

    @RequestMapping(value = "{id}" , produces = "application/xml")
    public Car findById(@PathVariable("id") int id) {
        return carRepository.findOne(id);
    }

    @RequestMapping(value="")
    public List<Car> findAll() {
        return carRepository.findAll();
    }
}
