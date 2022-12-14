package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;
import web.service.CarServiceImpl;

import java.util.List;

@Controller
public class CarsController {

    private CarService carService = new CarServiceImpl();

    @GetMapping(value = "/cars")
    public String getCarList(@RequestParam(value = "count", required = false) Integer count,
                             Model model) {
        List<Car> carList;
        if (count == null) {
            carList = carService.createCarsList(5);
        } else {
            carList = carService.createCarsList(count);
        }
        model.addAttribute("carList", carList);
        return "cars";
    }
}
