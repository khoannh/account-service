package mss301.fa25.accountservice.service;

import mss301.fa25.accountservice.model.User;
import mss301.fa25.accountservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

//    @Override
//    public User findByUsername(String username) {
//        return userRepository.findByUsername(username);
//    }
//
//    @Override
//    public User findByEmail(String email) {
//        return userRepository.findByEmail(email);
//    }

    @Override
    public void deleteUser(int id) {
        userRepository.delete(userRepository.findById(id));
    }

    @Override
    public boolean addUser(User user) {
        return userRepository.save(user) != null;
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }


}
