package com.SelectionProject.SelectionProject.model;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AgeRepository extends JpaRepository<Age, Long> {

    Optional<Age> findById(Long id);
}
