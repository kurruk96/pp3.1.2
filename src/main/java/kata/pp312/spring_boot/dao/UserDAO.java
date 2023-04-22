package kata.pp312.spring_boot.dao;

import kata.pp312.spring_boot.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDAO extends JpaRepository<User, Long> {
}
