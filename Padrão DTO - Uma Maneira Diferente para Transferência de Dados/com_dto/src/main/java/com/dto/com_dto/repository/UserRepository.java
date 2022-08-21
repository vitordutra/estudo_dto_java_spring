package com.dto.com_dto.repository;

import com.dto.com_dto.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
