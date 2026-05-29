package com.example.demo_esercizio3test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/salaries")
public class SalaryController {

    @Autowired
    private SalaryRepository salaryRepository;

    @Autowired
    private UserRepository userRepository;


    @GetMapping
    public List<EntitySalary> getAll() {
        return salaryRepository.findAll();
    }


    @GetMapping("/user/{userId}")
    public ResponseEntity<EntitySalary> getByUser(@PathVariable Long userId) {
        return salaryRepository.findByUserId(userId)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }


    @PostMapping
    public EntitySalary create(@RequestBody EntitySalary salary) {
        return salaryRepository.save(salary);
    }
}
