package com.example.CarService.Controller;

import com.example.CarService.domain.Car;
import com.example.CarService.domain.Vehicle;
import com.example.CarService.service.CarRegistrationService;
import com.example.CarService.service.Registration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RegisterController {

    @Autowired
    Registration registration;
/**
 1. Modify the below funtion.
 2. getRegistrationPage method accepts Model as argument.
**/

    @RequestMapping("/register")
    public String getRegistrationPage(Model model){
        Vehicle vehicle = registration.getNewCar();
        model.addAttribute("registerCar", vehicle);
        return "carregister";
    }


  /*
   1. getResponsePage method uses registerCar() method to register the car submitted from carregsiter.jsp.
   2. It should return "success" if registerCar() return true else it should return "carregister".
   3. getResponsePage method uses @ModelAttribute annotation to bind data with reference to car domain.
  */
    @RequestMapping("/done")
    public String getResponsePage(@ModelAttribute(value = "registerCar")Car car){
        //Write your logic here
        if (car.getRegisterationNumber() == null || car.getCarName() == null ||
                car.getCarDetails() == null || car.getCarWork() == null) {
            return "carregister";
        }
        if(registration.registerCar(String.valueOf(car.getCarId()), car.getCarName(), car.getCarDetails(), car.getCarWork())){
            return "success";
        } else {
            return "carregister";
        }
    }
}
