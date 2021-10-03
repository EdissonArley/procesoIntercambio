package com.uninpahu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.uninpahu.entity.Facultad;

@Repository
public interface FacultadRepository extends JpaRepository<Facultad, Integer> {

}
