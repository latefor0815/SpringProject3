package com.busanit501.springproject3.lhj.service;

import com.busanit501.springproject3.lhj.dto.UserDTO;
import java.util.List;

public interface UserService {
    UserDTO getUserById(Long id);
    UserDTO createUser(UserDTO userDTO);
    UserDTO updateUser(Long id, UserDTO userDTO);
    void deleteUser(Long id);
    List<UserDTO> getAllUsers();
}
