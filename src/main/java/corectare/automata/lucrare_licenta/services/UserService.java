package corectare.automata.lucrare_licenta.services;

import corectare.automata.lucrare_licenta.entities.User;
import corectare.automata.lucrare_licenta.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User addUser(User user) {
        return userRepository.save(user);
    }
    public boolean authenticateUser(String username, String password) {
        User user = userRepository.findByUsername(username);
        if (user != null && user.getPassword().equals(password)) {
            return true;
        }
        return false;
    }

}
