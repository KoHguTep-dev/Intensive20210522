package main.repos;

import main.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {
    User getBySessionId(String sessionId);
}