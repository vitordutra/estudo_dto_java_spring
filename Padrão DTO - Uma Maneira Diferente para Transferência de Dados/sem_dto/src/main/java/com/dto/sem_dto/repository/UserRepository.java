package com.dto.sem_dto.repository;

import com.dto.sem_dto.model.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Long> {
}
