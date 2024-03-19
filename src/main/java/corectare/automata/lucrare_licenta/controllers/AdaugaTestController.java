package corectare.automata.lucrare_licenta.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdaugaTestController {
    @GetMapping("/adaugatest")
    public String show() {
        return "adaugatest";
    }
}
