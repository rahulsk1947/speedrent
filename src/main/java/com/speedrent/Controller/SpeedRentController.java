package com.speedrent.Controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import com.speedrent.model.Car;


@RestController
public class SpeedRentController {

	@GetMapping("/speedrent")
    public Car index() {
		Car testCar = new Car("Speed","Rent");
        return testCar;
    }
}