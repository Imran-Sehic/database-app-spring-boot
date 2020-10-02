package com.databasemanagementapp.service;

import com.databasemanagementapp.model.User;
import com.databasemanagementapp.repository.UserRepository;
import java.util.List;
import java.util.Optional;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@Slf4j
@Transactional
public class UserService {
    
    private final UserRepository userRepository;
    
    public void insertUser(User user){
        userRepository.save(user);
    }
    
    @Transactional(readOnly = true)
    public List<User> getAllUsers(){
        return userRepository.findAll();
    }
    
    @Transactional(readOnly = true)
    public Optional<User> getUserById(Long id){
        return userRepository.findById(id);
    }
    
    public void updateUser(User user){
        userRepository.save(user);
    }
    
    public void deleteUserById(Long id){
        userRepository.deleteById(id);
    }
    
}
