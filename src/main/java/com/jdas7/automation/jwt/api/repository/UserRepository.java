package com.jdas7.automation.jwt.api.repository;

import com.jdas7.automation.jwt.api.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
  User findByUserName(String username);
}
