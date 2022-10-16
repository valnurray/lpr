package com.lankin.lpr.controller;

import com.lankin.lpr.model.Role;
import com.lankin.lpr.service.RoleService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/roles")
public class RoleController {

    private RoleService roleService;

    public RoleController(RoleService roleService) {
        this.roleService = roleService;
    }

    @PostMapping
    public ResponseEntity<Role> addRole(@RequestBody Role role){
        return new ResponseEntity<Role>(roleService.addRole(role), HttpStatus.CREATED);
    }

    @GetMapping
    public List<Role> getAllRoles(){
        return roleService.getAllRoles();
    }

    @GetMapping("{id}")
    public ResponseEntity<Role> getRoleById(@PathVariable("id") long roleId){
        return new ResponseEntity<Role>(roleService.getRoleById(roleId), HttpStatus.OK);
    }

    @PutMapping("{id}")
    public ResponseEntity<Role> updateRole(@PathVariable("id") long id
            ,@RequestBody Role role){
        return new ResponseEntity<Role>(roleService.updateRole(role, id), HttpStatus.OK);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteRole(@PathVariable("id") long id){
        roleService.deleteRole(id);
        return new ResponseEntity<String>("Role deleted successfully!", HttpStatus.OK);
    }

}
