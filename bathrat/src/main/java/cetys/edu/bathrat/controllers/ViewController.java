package cetys.edu.bathrat.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

public class ViewController {
    
    @GetMapping("/idBath")
    public String showIdBath() {
        return "BathId";
    }

}
