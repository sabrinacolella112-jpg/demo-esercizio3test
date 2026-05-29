package com.example.demo_esercizio3test;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface SalaryRepository extends JpaRepository<EntitySalary, Long> {
    Optional<EntitySalary> findByUserId(Long userId);
}
