package com.ciclocuatro.proyectociclo4.service;

import java.util.List;
import java.util.Optional;

import com.ciclocuatro.proyectociclo4.model.User;
import com.ciclocuatro.proyectociclo4.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    
    @Autowired
    private UserRepository userRepository;

    public List<User> getUsers(){
        return userRepository.getAllUsers();
    }

    public User guardarUser(User user){
    
        if (user != null){
            return userRepository.saveUser(user);
        }
        
        return null;
    }


    public Optional<User> getEmail(String email){
        return userRepository.findEmail(email);
    }

    public List<User> getEmailPass(String email, String password){
        return userRepository.findEmailAndPass(email,password);
    }

}
