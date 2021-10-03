package com.uninpahu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.uninpahu.entity.Estudiante;

@Repository
public interface EstudianteRepository extends JpaRepository<Estudiante, Integer> {

}
