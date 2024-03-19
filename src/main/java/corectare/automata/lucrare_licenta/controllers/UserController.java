package corectare.automata.lucrare_licenta.controllers;

import corectare.automata.lucrare_licenta.entities.User;
import corectare.automata.lucrare_licenta.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;
    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }
    @PostMapping("/login")
    public ResponseEntity<String> loginUser(@RequestParam String username, @RequestParam String password) {
        boolean isAuthenticated = userService.authenticateUser(username, password);
        if (isAuthenticated) {
            return ResponseEntity.ok("Authentication successful!");
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Authentication failed!");
        }
    }

}
