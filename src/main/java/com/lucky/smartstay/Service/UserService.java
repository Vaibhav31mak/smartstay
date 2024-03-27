package com.lucky.smartstay.Service;

import com.lucky.smartstay.Controllers.UserController;
import com.lucky.smartstay.Models.User;
import com.lucky.smartstay.Models.UserDto;
import com.lucky.smartstay.Repo.Userrepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private Userrepo userRepository;

    public User addUser(User user) {

        String encodedpassword=new BCryptPasswordEncoder(12).encode(user.getPassword());
        user.setPassword(encodedpassword);
        return
                userRepository.save(user);
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public List<UserDto> getUsersWithProperties() {
        List<User> users = userRepository.findAll();

        List<UserDto> userDtos = new ArrayList<>();

        for (User user : users) {
            UserDto userDto = new UserDto();
            userDto.setId(user.getId());
            userDto.setFirstName(user.getFirstName());
            userDto.setLastName(user.getLastName());
            userDto.setEmail(user.getEmail());
            userDto.setPhoneNo(user.getPhoneNo());
            userDto.setRole(user.getRole());
            userDto.setProperties(user.getProperties());
            userDtos.add(userDto);
        }

        return userDtos;
    }

    public List<UserDto> findAll() {
        return userRepository.findAllAsDto();

    }

    public User deleteuser(Integer userId) {
        

         userRepository.deleteById(userId);

            return null;
    }
    // Add other user-related methods as needed
}