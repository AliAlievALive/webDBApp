package ru.halal.sweater.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.halal.sweater.domain.User;

public interface UserRepo extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
