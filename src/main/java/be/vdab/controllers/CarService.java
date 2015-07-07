package be.vdab.controllers;

import be.vdab.domain.Car;
import be.vdab.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jeansmits on 07/07/15.
 */

@RestController
@RequestMapping("car")
public class CarService {
    @Autowired
    private CarRepository carRepository;
    @RequestMapping("{id}")
    public Car findById(@PathVariable("id") int id) {
        return carRepository.findOne(id);
    }
}
