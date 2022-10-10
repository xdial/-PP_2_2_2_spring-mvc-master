package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarsServiceImpl;

@Controller
public class CarController {
    private final CarsServiceImpl carsService;

    @Autowired
    public CarController(CarsServiceImpl carsService) {

        this.carsService = carsService;
    }

    @GetMapping(value = "/cars")
    public String printWelcome(ModelMap model, @RequestParam(name = "count", defaultValue = "5") int count) {
        model.addAttribute("carsList", carsService.listCars(count));
        return "cars";
    }
}
