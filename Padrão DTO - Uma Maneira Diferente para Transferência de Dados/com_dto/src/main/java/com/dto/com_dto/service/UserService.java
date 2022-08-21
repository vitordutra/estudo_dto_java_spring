package com.dto.com_dto.service;

import com.dto.com_dto.dto.UserDTO;
import com.dto.com_dto.model.User;
import com.dto.com_dto.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public UserDTO create(User user) {
        UserDTO userDTO = new UserDTO();
        userDTO.convert(user);
        user.setAdmin(false);
        repository.save(user);
        return userDTO;
    }

    public List<UserDTO> getAll() {
        UserDTO userDTO = new UserDTO();
        return userDTO.convertList(repository.findAll());
    }
}
