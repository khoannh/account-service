package mss301.fa25.accountservice.config;

import mss301.fa25.accountservice.model.Role;
import mss301.fa25.accountservice.model.User;
import mss301.fa25.accountservice.repository.RoleRepository;
import mss301.fa25.accountservice.repository.UserRepository;
import mss301.fa25.accountservice.service.RoleService;
import mss301.fa25.accountservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInit implements CommandLineRunner {

    @Autowired
    private RoleService roleService;

    @Autowired
    private UserService userService;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Override
    public void run(String... args) throws Exception {
        if(userRepository.count() != 0 || roleRepository.count() != 0) {
            System.out.println("Users and Roles have been created");
            return;
        }
        Role role1 = new Role();
        role1.setName("admin");
        roleService.addRole(role1);

        User admin = new User();
        admin.setUsername("admin");
        admin.setPassword("admin");
        admin.setEmail("admin@gmail.com");
        admin.setRole(role1);
        userService.addUser(admin);

        Role role2 = new Role();
        role2.setName("user");
        roleService.addRole(role2);

        User user = new User();
        user.setUsername("user");
        user.setPassword("user");
        user.setEmail("user@gmail.com");
        user.setRole(role2);
        userService.addUser(user);
    }
}
