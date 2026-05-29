package com.example.demo_esercizio3test;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SalaryRepository extends JpaRepository<EntitySalary, Long> {
    Optional<EntitySalary> findByUserId(Long userId);
}
