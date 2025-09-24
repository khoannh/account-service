package mss301.fa25.accountservice.service;

import mss301.fa25.accountservice.model.User;

import java.util.List;

public interface UserService {
//    public User findByUsername(String username);
//    public User findByEmail(String email);
    public void deleteUser(int id);
    public boolean addUser(User user);
    public List<User> getAllUsers();
}
