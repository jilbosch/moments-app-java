package com.proves1.imatges.repositories;

import com.proves1.imatges.models.Moment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IMomentRepository extends JpaRepository<Moment,Long> {
    @Query("select m from Moment m where m.descripcion like %:search% or m.title like %:search%")
    List<Moment> findByDescripcionOrTitleContaining(@Param("search") String search);
}
