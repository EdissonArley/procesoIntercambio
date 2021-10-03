package com.uninpahu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.uninpahu.entity.Rol;

@Repository
public interface RolRepository extends JpaRepository<Rol, Integer>{

}
