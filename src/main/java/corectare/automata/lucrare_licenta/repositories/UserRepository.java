package corectare.automata.lucrare_licenta.repositories;

import corectare.automata.lucrare_licenta.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
