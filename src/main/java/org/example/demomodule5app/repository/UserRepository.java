package org.example.demomodule5app.repository;

import org.example.demomodule5app.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
