package com.example.demo_esercizio3test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/roles")
public class RoleController {
    @Autowired
    private RoleRepository roleRepository;

    @PostMapping
    public EntityRole create(@RequestBody EntityRole role){
        return roleRepository.save(role);
    }
}
