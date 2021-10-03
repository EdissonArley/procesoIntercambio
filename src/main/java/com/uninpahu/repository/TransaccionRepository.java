package com.uninpahu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.uninpahu.entity.Transaccion;

@Repository
public interface TransaccionRepository extends JpaRepository<Transaccion, Integer>{

}
