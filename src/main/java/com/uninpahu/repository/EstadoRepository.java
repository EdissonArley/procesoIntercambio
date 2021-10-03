package com.uninpahu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.uninpahu.entity.Estado;

@Repository
public interface EstadoRepository extends JpaRepository<Estado, Integer>{

}
