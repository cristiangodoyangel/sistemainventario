package cl.pmtintegra.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {

    @GetMapping("/")
    public String inicio(Model model) {
        model.addAttribute("titulo", "Inventario PMT Integra");
        model.addAttribute("items", List.of("Material A", "Material B", "Material C"));
        return "index";
    }
}
