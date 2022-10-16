package com.lankin.lpr.service;

import com.lankin.lpr.model.Role;
import com.lankin.lpr.model.User;

import java.util.List;

public interface RoleService {
    Role addRole(Role role);
    List<Role> getAllRoles();
    Role getRoleById(long id);
    Role updateRole(Role role, long id);
    void deleteRole(long id);
}
