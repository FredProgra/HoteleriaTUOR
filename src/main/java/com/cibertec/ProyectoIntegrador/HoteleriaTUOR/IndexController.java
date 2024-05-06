package com.cibertec.ProyectoIntegrador.HoteleriaTUOR;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
    @GetMapping("/index")
    public String index(){
        return "/admin/index";
    }
    @GetMapping("/quienes-somos")
    public String QuienesSomos(){
        return "/admin/quienes-somos";
    }
}
