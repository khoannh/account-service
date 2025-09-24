package mss301.fa25.accountservice.service;

import mss301.fa25.accountservice.model.Role;
import mss301.fa25.accountservice.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl implements RoleService{
    @Autowired
    private RoleRepository roleRepository;

    @Override
    public boolean addRole(Role role) {
        return roleRepository.save(role) != null;
    }
}
