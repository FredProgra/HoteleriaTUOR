package com.cibertec.ProyectoIntegrador.HoteleriaTUOR;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;

@Controller
public class HomeController {
    @GetMapping("/home")
    public String home(){
        return "home";
    }
}
