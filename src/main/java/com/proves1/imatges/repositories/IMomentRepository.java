package com.proves1.imatges.repositories;

import com.proves1.imatges.models.Imatge;
import com.proves1.imatges.models.Moment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface IMomentRepository extends JpaRepository<Moment, Long> {
    @Query("select m from Moment m where m.descripcion like %:search% or m.title like %:search%")
    List <Moment> findByDescripcionOrTitleContaining(@Param("search") String search);

}
