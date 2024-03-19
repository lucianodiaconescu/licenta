package corectare.automata.lucrare_licenta.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CorecteazaTestController {
    @GetMapping("/corecteazatest")
    public String show() {
        return "corecteazatest";
    }
}
