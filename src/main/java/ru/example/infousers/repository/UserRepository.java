package ru.example.infousers.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.example.infousers.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
   // List<UserEntity> findByName(String name);
}
