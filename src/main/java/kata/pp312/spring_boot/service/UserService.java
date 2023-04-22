package kata.pp312.spring_boot.service;


import kata.pp312.spring_boot.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    List<User> findAll();
    User findOne(long id);
    void save(User user);
    void deleteById(long id);
    void update(long id, User user);
}
