package com.lankin.lpr.service.Impl;

import com.lankin.lpr.exception.ResourceNotFoundException;
import com.lankin.lpr.model.Role;
import com.lankin.lpr.repository.RoleRepository;
import com.lankin.lpr.service.RoleService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {

    private RoleRepository roleRepository;

    public RoleServiceImpl(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    @Override
    public Role addRole(Role role) {
        return roleRepository.save(role);
    }

    @Override
    public List<Role> getAllRoles() {
        return roleRepository.findAll();
    }

    @Override
    public Role getRoleById(long id) {
        return roleRepository.findById(id).orElseThrow(() ->
                new ResourceNotFoundException("Role", "Id", id));
    }

    @Override
    public Role updateRole(Role role, long id) {
        Role existingRole = roleRepository.findById(id).orElseThrow(
                () -> new ResourceNotFoundException("Role", "Id", id));

        existingRole.setRoles(role.getRoles());
        roleRepository.save(existingRole);
        return existingRole;
    }

    @Override
    public void deleteRole(long id) {
        roleRepository.findById(id).orElseThrow(() ->
                new ResourceNotFoundException("Role", "Id", id));
        roleRepository.deleteById(id);
    }
}
