package corectare.automata.lucrare_licenta.controllers;

import corectare.automata.lucrare_licenta.entities.User;
import corectare.automata.lucrare_licenta.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ViewController {
    @Autowired
    @GetMapping("/login")
    public String showLoginPage() {
        return "login";
    }

    @GetMapping("/register")
    public String showRegisterPage() {
        return "register";
    }

}
