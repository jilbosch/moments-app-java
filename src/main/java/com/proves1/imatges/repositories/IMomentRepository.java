package com.proves1.imatges.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface IMomentRepository extends JpaRepository<T, ID> {
    List<T> findAll();

    Optional<T> findById(ID id);
}
