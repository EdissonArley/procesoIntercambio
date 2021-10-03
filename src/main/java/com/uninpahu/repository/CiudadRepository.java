package com.uninpahu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.uninpahu.entity.Ciudad;

@Repository
public interface CiudadRepository extends JpaRepository<Ciudad, Integer> {

}
