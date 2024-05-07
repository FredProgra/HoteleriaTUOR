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
    @GetMapping("/atractivos-turisticos")
    public String AtractivosTuristicos(){
        return "/admin/atractivos-turisticos";
    }
    @GetMapping("/gastronomia")
    public String Gastronomi(){
        return "/admin/gastronomia";
    }
    @GetMapping("/galeria")
    public  String Galeria(){
        return "/admin/galeria";
    }
    @GetMapping("/videos")
    public String Videos(){
        return "/admin/videos";
    }
    @GetMapping("/contactenos")
    public String Contactenos(){
        return "/admin/contactenos";
    }
    @GetMapping("/fortaleza-real-felipe")
    public String Fortaleza_real_felipe(){
        return "/admin/fortaleza-real-felipe";
    }

    @GetMapping("/museo-naval-peru")
    public String Museo_naval_peru(){
        return "/admin/museo-naval-peru";
    }

    @GetMapping("/zona-monumental-callao")
    public String Zona_monumental_callao(){
        return "/admin/zona-monumental-callao";
    }

    @GetMapping("/huaca-el-paraiso")
    public String Huaca_el_paraiso(){
        return "/admin/huaca-el-paraiso";
    }
    @GetMapping("/museo-submarino-abtao")
    public String Museo_submarino_abtao(){
        return "/admin/museo-submarino-abtao";
    }

    @GetMapping("/humedales-de-ventanilla")
    public String Humedales_de_ventanilla(){
        return "/admin/humedales-de-ventanilla";
    }
}
