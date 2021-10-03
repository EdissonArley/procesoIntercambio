package com.uninpahu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.uninpahu.entity.RolUsuarios;

@Repository
public interface RolUsuariosRepository extends JpaRepository<RolUsuarios, Integer>{

}
