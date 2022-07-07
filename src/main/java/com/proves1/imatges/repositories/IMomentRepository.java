package com.proves1.imatges.repositories;

import com.proves1.imatges.models.Imatge;
import com.proves1.imatges.models.Moment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface IMomentRepository extends JpaRepository<Moment, Long> {

}
