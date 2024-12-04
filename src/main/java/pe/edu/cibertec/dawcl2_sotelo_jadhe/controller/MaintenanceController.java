package pe.edu.cibertec.dawcl2_sotelo_jadhe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/maintenance")
public class MaintenanceController {

    @GetMapping("/start")
    public String start(Model model){
        model.addAttribute("message","Hello World");
        return "maintenance";
    }
}
